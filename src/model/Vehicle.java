package model;

public class Vehicle {
    private String mark;
    private double speed;
    private boolean condition;

    public Vehicle(String mark, double speed, boolean condition) {
        this.mark = mark;
        this.speed = speed;
        this.condition = condition;
    }

    public Vehicle() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    // Вычисление длительности поездки
    public double tripDuration (double distance) {
        if(condition) {
            return distance/speed;
        }
        return 0;
    }

    @Override
    public String toString() {
        return mark;
    }
}
