package hw5.businessLogical;

import hw5.entities.Entity;
import hw5.entities.Model3D;
import hw5.entities.Texture;
import java.util.Collection;

/**
 * Интерфейс BLL (Business Logical Layer)
 */
public interface BusinessLogicalLayer {

    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTexture();
    void renderModel(Model3D model);
    void renderAllModels();
    Collection<Entity> removeAll();
}
