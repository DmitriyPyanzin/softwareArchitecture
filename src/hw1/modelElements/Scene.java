package hw1.modelElements;

import hw1.modelElements.poligonalModel.PoligonalModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Сцена вбирающая свет, камеру, полигональную модель
 */
public class Scene {

    private int id;
    private final List<PoligonalModel> models;
    private List<Flash> flashes;
    private List<Camera> cameras;
    private final Map<Integer, Scene> scenes = new HashMap<>();

    public int getId() {return id;}

    public List<PoligonalModel> getModels() {return models;}

    public List<Flash> getFlashes() {return flashes;}

    public List<Camera> getCameras() {return cameras;}

    public Scene(List<PoligonalModel> models) {this.models = models;}

    public Scene(List<PoligonalModel> models, List<Flash> flashes) {
        this.models = models;
        this.flashes = flashes;
    }

    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }
}
