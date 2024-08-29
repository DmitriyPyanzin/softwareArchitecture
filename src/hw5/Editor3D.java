package hw5;

import hw5.entities.Model3D;
import hw5.entities.Texture;

import java.util.ArrayList;

/**
 * UI (User Interface)
 */
class Editor3D implements UILayer{

    private ProjectFile projectFile;
    private BusinessLogicalLayer businessLogicalLayer;
    private Database database;

    private void initialize(){
        database = new EditorDatabase(projectFile);
        DatabaseAccess databaseAccess = new EditorDatabaseAccess(database);
        businessLogicalLayer = new EditorBusinessLogicalLayer(databaseAccess);
    }

    @Override
    public void openProject(String fileName) {
        this.projectFile = new ProjectFile(fileName);
        initialize();
    }

    @Override
    public void showProjectSettings() {

        //Предусловия
        checkProjectFile();

        System.out.println("*** Project v1 ***");
        System.out.println("******************");
        System.out.println("fileName: %s\n" + projectFile.getFileName());
        System.out.println("setting1: %d\n" + projectFile.getSetting1());
        System.out.println("setting2: %s\n" + projectFile.getSetting2());
        System.out.println("setting3: %s\n" + projectFile.isSetting3());
        System.out.println("******************");
    }

    private void checkProjectFile(){if (projectFile == null) throw new RuntimeException("Файл проекта не определён");}

    @Override
    public void saveProject() {

        //Предусловия
        checkProjectFile();

        database.save();
        System.out.println("Изменения успешно сохранены.");
    }

    @Override
    public void printAllModels() {

        //Предусловия
        checkProjectFile();

        ArrayList<Model3D> models = (ArrayList<Model3D>)businessLogicalLayer.getAllModels();
        for (int i = 0; i < models.size(); i++) {
            System.out.printf("===%d===\n", i);
            System.out.println(models.get(i));
            for (Texture texture : models.get(i).getTextures()) System.out.printf("\t%s\n", texture);
        }
    }

    @Override
    public void printAllTextures() {

        //Предусловия
        checkProjectFile();

        ArrayList<Texture> textures = (ArrayList<Texture>)businessLogicalLayer.getAllTexture();
        for (int i = 0; i < textures.size(); i++) {
            System.out.printf("===%d===\n", i);
            System.out.println(textures.get(i));
        }
    }

    @Override
    public void renderAll() {

        //Предусловия
        checkProjectFile();

        System.out.println("Подождите ...");
        long startTime = System.currentTimeMillis();
        businessLogicalLayer.renderAllModels();
        long endTime = System.currentTimeMillis() - startTime;
        System.out.printf("Операция выполнена за %d мс.\n", endTime);
    }

    @Override
    public void renderModel(int i) {

        //Предусловия
        checkProjectFile();

        ArrayList<Model3D> models = (ArrayList<Model3D>)businessLogicalLayer.getAllModels();
        if (i < 0 || i > models.size() - 1) throw new RuntimeException("Номер модели указан некорректно.");
        System.out.println("Подождите ...");
        long startTime = System.currentTimeMillis();
        businessLogicalLayer.renderAllModels();
        long endTime = System.currentTimeMillis() - startTime;
        System.out.printf("Операция выполнена за %d мс.\n", endTime);
    }
}
