package model;

public class FreightCar extends Vehicle{
    private double maximumLoadCapacity;

    public FreightCar(String mark, double speed, boolean condition, double maximumLoadCapacity) {
        super(mark, speed, condition);
        this.maximumLoadCapacity = maximumLoadCapacity;
    }

    public double getMaximumLoadCapacity() {
        return maximumLoadCapacity;
    }

    public void setMaximumLoadCapacity(double maximumLoadCapacity) {
        this.maximumLoadCapacity = maximumLoadCapacity;
    }
}
