package hw5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * Database
 */
class EditorDatabase implements Database{

    private final Random random = new Random();
    private Collection<Entity> entities;

    public EditorDatabase(ProjectFile projectFile) {
        load();
    }

    @Override
    public void load() {}

    @Override
    public void save() {}

    private void generateModelAndTextures(){
        Model3D model3D = new Model3D();
        int txCount = random.nextInt(3);
        for (int i = 0; i < txCount; i++) {
            Texture texture = new Texture();
            model3D.getTextures().add(texture);
            entities.add(texture);
        }
        entities.add(model3D);
    }

    public Collection<Entity> getAll(){
        if (entities == null){
            entities = new ArrayList<>();
            int entCount = random.nextInt(5, 11);
            for (int i = 0; i < entCount; i++) {
                generateModelAndTextures();
            }
        }
        return entities;
    }
}
