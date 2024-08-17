package hw3;

import java.awt.*;

public abstract class Car {

    //region Constructors

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    //endregion

    //region Public Methods

    public abstract void movement();

    public abstract void maintenance();

    public abstract boolean gearShifting();

    public abstract boolean switchHeadLights();

    public abstract boolean switchWipers();

    //public abstract boolean sweeping();

    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }

    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    //endregion

    //region Private Fields

    private final String make;

    private final String model;

    private final Color color;

    protected CarType type;

    private int wheelsCount;

    protected FuelType fuelType;

    protected GearboxType gearboxType;

    private double engineCapaciry;

    private boolean fogLights = false;

    protected WipingType wipingType;

    //endregion

}
