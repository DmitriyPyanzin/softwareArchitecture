package hw1.inMemoryModel;

public interface ModelChanger {

    /**
     * Отслеживание событий
     */
    void notifyChange();

    /**
     * Добавление новой модели
     */
    void RegisterModelChanger(ModelChangesObserver o);

    /**
     * Удаление модели
     */
    void RemoveModelChanger(ModelChangesObserver o);

}
