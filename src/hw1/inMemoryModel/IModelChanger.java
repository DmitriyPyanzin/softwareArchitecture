package hw1.inMemoryModel;

public interface IModelChanger {

    void notifyChange();

    void modelChanger(IModelChangesObserver o);

}
