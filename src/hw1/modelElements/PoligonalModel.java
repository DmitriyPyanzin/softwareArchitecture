package hw1.modelElements;

import java.util.List;

/**
 * Модель из текстур и полигонов
 */
public class PoligonalModel {

    /**
     * Список полигонов
     */
    private final List<Poligon> poligons;

    /**
     * Список текстур
     */
    private List<Texture> textures;

    public List<Poligon> getPoligons() {
        return poligons;

    }

    public List<Texture> getTextures() {
        return textures;

    }

    /**
     * Конструктор модели без текстур
     */
    public PoligonalModel(List<Poligon> poligons) {
        this.poligons = poligons;

    }

    /**
     * Конструктор модели с текстурами
     */
    public PoligonalModel(List<Poligon> poligons, List<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }

}
