package hw1.inMemoryModel;

public class Observer2 implements ModelChangesObserver{

    @Override
    public void applyUpdateModel() {
        System.out.println("Добавлена новая полигональная модель - observer#2");

    }
}
