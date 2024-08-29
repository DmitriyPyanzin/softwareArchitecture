package hw5.businessLogical;

import hw5.databaseAccess.DatabaseAccess;
import hw5.entities.Model3D;
import hw5.entities.Texture;
import java.util.Collection;
import java.util.Random;

/**
 * Реализация Business Logical Layer
 */
public class EditorBusinessLogicalLayer implements BusinessLogicalLayer {

    private final DatabaseAccess databaseAccess;
    private final Random random = new Random();

    public EditorBusinessLogicalLayer(DatabaseAccess databaseAccess) {this.databaseAccess = databaseAccess;}

    @Override
    public Collection<Model3D> getAllModels() {return databaseAccess.getAllModels();}

    @Override
    public Collection<Texture> getAllTexture() {return databaseAccess.getAllTextures();}

    @Override
    public void renderModel(Model3D model) {processRender(model);}

    @Override
    public void renderAllModels() {
        for (Model3D model : getAllModels()) processRender(model);
    }

    private void processRender(Model3D model) {
        try
        {
            Thread.sleep(2500 - random.nextInt(2000));
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
