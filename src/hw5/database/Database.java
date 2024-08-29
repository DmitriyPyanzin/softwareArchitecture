package hw5.database;

import hw5.entities.Entity;
import java.util.Collection;

/**
 * Интерфейс БД
 */
public interface Database {

    void load();
    void save();
    Collection<Entity> getAll();
    void delete();
    void deleteAll();
}
