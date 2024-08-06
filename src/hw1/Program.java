package hw1;

import hw1.inMemoryModel.ModelStore;
import hw1.inMemoryModel.Observer1;
import hw1.inMemoryModel.Observer2;
import hw1.modelElements.Poligon;
import hw1.modelElements.PoligonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args){

        Observer1 observer1 = new Observer1();

        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);
        Poligon p1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(p1);
        PoligonalModel poligonalModel = new PoligonalModel(poligons);
        store.add(poligonalModel);

    }
}
