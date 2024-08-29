package hw5;

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
