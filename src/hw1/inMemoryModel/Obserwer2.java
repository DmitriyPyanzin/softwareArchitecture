package hw1.inMemoryModel;

public class Obserwer2 implements ModelChangesObserver{

    @Override
    public void applyUpdateModel() {
        System.out.println("Добавлена новая полигональная модель - observer#2");

    }
}
