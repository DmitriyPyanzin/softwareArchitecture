package hw1.test;

import hw1.inMemoryModel.IModelChangesObserver;

/**
 * Первый наблюдатель
 */
public class Observer1 implements IModelChangesObserver {

    @Override
    public void applyUpdateModel() {
        System.out.println("Добавлена новая полигональная модель - observer#1");

    }
}
