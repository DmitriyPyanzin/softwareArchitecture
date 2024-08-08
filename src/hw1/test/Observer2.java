package hw1.test;

import hw1.inMemoryModel.IModelChangesObserver;

/**
 * Второй наблюдатель
 */
public class Observer2 implements IModelChangesObserver {

    @Override
    public void applyUpdateModel() {
        System.out.println("Добавлена новая полигональная модель - observer#2");

    }
}
