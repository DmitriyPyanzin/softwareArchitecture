package hw1;

import hw1.inMemoryModel.ModelStore;
import hw1.test.Observer1;
import hw1.test.Observer2;
import hw1.modelElements.poligonalModel.Poligon;
import hw1.modelElements.poligonalModel.PoligonalModel;
import hw1.modelElements.poligonalModel.Texture;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args){

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);
        store.RegisterModelChanger(observer2);

        Poligon p1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(p1);
        Texture t1 = new Texture("Texture");
        List<Texture> textures = new ArrayList<>();
        textures.add(t1);

        PoligonalModel poligonalModel1 = new PoligonalModel(poligons, textures);
        PoligonalModel poligonalModel2 = new PoligonalModel(poligons);
        store.add(poligonalModel1);
        store.add(poligonalModel2);
    }
}
