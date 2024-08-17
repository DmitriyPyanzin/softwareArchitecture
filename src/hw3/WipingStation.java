package hw3;

public class WipingStation implements WipingWippin{

    @Override
    public void wiping(WipingType wipingType) {
        switch (wipingType){
            case Mirrors -> System.out.println("Моют зеркала");
            case Headlights -> System.out.println("Моют фары");
            case Windshield -> System.out.println("Моую стекла");
        }
    }
}
