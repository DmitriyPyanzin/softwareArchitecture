package hw5.databaseAccess;

import hw5.entities.Entity;
import hw5.entities.Model3D;
import hw5.entities.Texture;
import java.util.Collection;

/**
 * Интерфейс DAC
 */
public interface DatabaseAccess {

    void addEntity(Entity entity);
    void removeEntity(Entity entity);
    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();
}
