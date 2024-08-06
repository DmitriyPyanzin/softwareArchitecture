package hw1.inMemoryModel;

import hw1.modelElements.Camera;
import hw1.modelElements.Flash;
import hw1.modelElements.PoligonalModel;
import hw1.modelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements ModelChanger {

    private final List<PoligonalModel> models = new ArrayList<>();
    private final List<Flash> flashes = new ArrayList<>();
    private final List<Scene> scenes = new ArrayList<>();
    private final List<Camera> cameras = new ArrayList<>();
    private final List<ModelChangesObserver> observers = new ArrayList<>();

    public void add(PoligonalModel model) {
        models.add(model);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (ModelChangesObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void RegisterModelChanger(ModelChangesObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangesObserver o) {
        observers.remove(o);
    }
}
