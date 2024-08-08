package hw1;

import hw1.inMemoryModel.ModelStore;
import hw1.modelElements.Scene;
import hw1.test.Observer;
import hw1.modelElements.poligonalModel.Poligon;
import hw1.modelElements.poligonalModel.PoligonalModel;
import hw1.modelElements.poligonalModel.Texture;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args){

        Observer observer1 = new Observer();

        ModelStore store = new ModelStore();
        store.modelChanger(observer1);


        Poligon p1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(p1);
        Texture t1 = new Texture("Texture");
        List<Texture> textures = new ArrayList<>();
        textures.add(t1);

        PoligonalModel poligonalModel = new PoligonalModel(poligons, textures);
        List<PoligonalModel> pm = new ArrayList<>();
        pm.add(poligonalModel);

        Scene scene = new Scene(pm);
        store.add(scene);

        store.getScene(0);
    }
}
