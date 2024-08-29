package hw5;

import hw5.entities.Model3D;
import hw5.entities.Texture;

import java.util.Collection;

/**
 * Интерфейс BLL (Business Logical Layer)
 */
interface BusinessLogicalLayer {

    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTexture();
    void renderModel(Model3D model);
    void renderAllModels();
}
