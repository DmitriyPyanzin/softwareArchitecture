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

}
