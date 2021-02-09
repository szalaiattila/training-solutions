package inheritanceconstructor;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if ( fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }
    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }
    public void drive(int km) {
        if(isEnough(km)) {
            throw new RuntimeException("Not enough fuel available!");
        }
        fuel -= km * fuelRate / 100;
    }
    public boolean isEnough(int distance) {
        return (fuel - distance * fuelRate / 100) <= 0.0;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
    public double calculateRefillAmount() {
        double tillFull = 0.0;
        if (fuel != tankCapacity) {
            tillFull = tankCapacity - fuel;
        }
        return tillFull;
    }
}
