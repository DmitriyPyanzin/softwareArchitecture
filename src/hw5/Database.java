package hw5;

import java.util.Collection;

/**
 * Интерфейс БД
 */
interface Database {

    void load();
    void save();
    Collection<Entity> getAll();

}
