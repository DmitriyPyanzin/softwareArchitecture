package hw1.inMemoryModel;

public interface IModelChanger {

    /**
     * Отслеживание событий
     */
    void notifyChange();

    /**
     * Добавление новой модели
     */
    void RegisterModelChanger(IModelChangesObserver o);

    /**
     * Удаление модели
     */
    void RemoveModelChanger(IModelChangesObserver o);

}
