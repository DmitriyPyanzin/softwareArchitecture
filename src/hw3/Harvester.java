package hw3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping{

    private Refueling refueling;
    private WipingWippin wipingWippin;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public void setRefueling(RefuelingStation refuelingStation) {this.refueling = refuelingStation;}

    @Override
    public void fuel() {if (refueling != null){refueling.fuel(fuelType);}}

    public void setWipingWippin(WipingStation wipingStation) {this.wipingWippin = wipingStation;}

    @Override
    public void wiping() {if (wipingWippin != null){wipingWippin.wiping(wipingType);}}

    @Override
    public void movement() {}

    @Override
    public void maintenance() {}

    @Override
    public boolean gearShifting() {return false;}

    @Override
    public boolean switchHeadLights() {return false;}

    @Override
    public boolean switchWipers() {return false;}

    public void sweeping() {System.out.println("Автомобиль метёт улицу");}
}
