package hw1.modelElements.poligonalModel;

import java.util.List;

/**
 * Модель из текстур и полигонов
 */
public class PoligonalModel {

    private final List<Poligon> poligons;
    private List<Texture> textures;

    public List<Poligon> getPoligons() {return poligons;}

    public List<Texture> getTextures() {return textures;}

    public PoligonalModel(List<Poligon> poligons) {this.poligons = poligons;}

    public PoligonalModel(List<Poligon> poligons, List<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }
}
