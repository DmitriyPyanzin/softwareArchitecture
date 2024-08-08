package hw1.test;

import hw1.inMemoryModel.IModelChangesObserver;

/**
 * Первый наблюдатель
 */
public class Observer implements IModelChangesObserver {

    @Override
    public void applyUpdateModel() {
        System.out.println("Изменена полигональная модель - observer#1");
    }
}
