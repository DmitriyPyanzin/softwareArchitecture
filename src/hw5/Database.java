package hw5;

import hw5.entities.Entity;

import java.util.Collection;

/**
 * Интерфейс БД
 */
interface Database {

    void load();
    void save();
    Collection<Entity> getAll();
    void delete();
    void deleteAll();
}
