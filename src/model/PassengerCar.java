package model;

public class PassengerCar extends Vehicle {
    private int numberOfPassengers;

    public PassengerCar(String mark, double speed, boolean condition, int numberOfPassengers) {
        super(mark, speed, condition);
        this.numberOfPassengers = numberOfPassengers;
    }

    public PassengerCar() {
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
