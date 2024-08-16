package hw3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping{

    private Refueling refueling;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public RefuelingStation getRefueling() {return (RefuelingStation) refueling;}

    public void setRefueling(RefuelingStation refuelingStation) {this.refueling = refuelingStation;}

    @Override
    public void fuel() {if (refueling != null){refueling.fuel(fuelType);}}

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метёт улицу");;
    }

    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }
}
