package hw1.modelElements;

import hw1.modelElements.poligonalModel.PoligonalModel;
import java.util.List;

/**
 * Сцена вбирающая свет, камеру, полигональную модель
 */
public class Scene {

    private int id;
    private List<PoligonalModel> models;
    private List<Flash> flashes;
    private List<Camera> cameras;

}
