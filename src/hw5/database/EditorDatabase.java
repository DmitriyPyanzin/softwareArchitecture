package hw5.database;

import hw5.ProjectFile;
import hw5.entities.Entity;
import hw5.entities.Model3D;
import hw5.entities.Texture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * Database
 */
public class EditorDatabase implements Database {

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

    @Override
    public Collection<Entity> deleteAll() {
        if (entities.isEmpty()) throw new RuntimeException("Моделей и текстур нет");
        getAll().removeAll(entities);
        return entities;
    }
}
