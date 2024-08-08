package hw1.inMemoryModel;

/**
 * Первый наблюдатель
 */
public class Observer1 implements ModelChangesObserver{

    @Override
    public void applyUpdateModel() {
        System.out.println("Добавлена новая полигональная модель - observer#1");

    }
}
