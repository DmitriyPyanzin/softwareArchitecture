package hw5.databaseAccess;

import hw5.database.Database;
import hw5.entities.Entity;
import hw5.entities.Model3D;
import hw5.entities.Texture;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Реализация DAC
 */
public class EditorDatabaseAccess implements DatabaseAccess {

    private final Database editorDatabase;
    protected Collection<Entity> entities;

    public EditorDatabaseAccess(Database editorDatabase) {this.editorDatabase = editorDatabase;}

    @Override
    public Collection<Model3D> getAllModels() {
        Collection<Model3D> models = new ArrayList<>();
        for (Entity entity : editorDatabase.getAll()){
            if (entity instanceof Model3D) models.add((Model3D) entity);
        }
        return models;
    }

    @Override
    public Collection<Texture> getAllTextures() {
        Collection<Texture> models = new ArrayList<>();
        for (Entity entity : editorDatabase.getAll()){
            if (entity instanceof Texture) models.add((Texture) entity);
        }
        return models;
    }

    @Override
    public void addEntity(Entity entity) {editorDatabase.getAll().add(entity);}

    @Override
    public void removeEntity(Entity entity) {editorDatabase.getAll().remove(entity);}

    @Override
    public Collection<Entity> removeAllEntity() {
        return editorDatabase.deleteAll();
    }
}
