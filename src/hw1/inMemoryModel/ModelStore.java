package hw1.inMemoryModel;

import hw1.modelElements.Camera;
import hw1.modelElements.Flash;
import hw1.modelElements.poligonalModel.PoligonalModel;
import hw1.modelElements.Scene;
import java.util.ArrayList;
import java.util.List;

/**
 * Хранилище моделей элементов
 */
public class ModelStore implements IModelChanger {

    private final List<PoligonalModel> models = new ArrayList<>();
    private final List<Scene> scenes = new ArrayList<>();
    private final List<Flash> flashes = new ArrayList<>();
    private final List<Camera> cameras = new ArrayList<>();

    /**
     * Список наблюдателей
     */
    private final List<IModelChangesObserver> observers = new ArrayList<>();

    public void add(PoligonalModel model) {
        models.add(model);
        notifyChange();
    }

    public void remove(PoligonalModel model) {
        models.remove(model);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (IModelChangesObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void modelChanger(IModelChangesObserver o) {observers.add(o);}
}
