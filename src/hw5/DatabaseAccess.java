package hw5;

import java.util.Collection;

/**
 * Интерфейс DAC
 */
interface DatabaseAccess {

    void addEntity(Entity entity);
    void removeEntity(Entity entity);
    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();

}
