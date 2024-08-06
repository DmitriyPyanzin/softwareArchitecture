package hw1.inMemoryModel;

public interface ModelChanger {

    /**
     * Произошло изменение в хранилище моделей
     */
    void notifyChange();
    void RegisterModelChanger(ModelChangesObserver o);
    void RemoveModelChanger(ModelChangesObserver o);

}
