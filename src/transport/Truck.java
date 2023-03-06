package transport;

import driver.Driver;
import driver.DriverC;

public class Truck extends Transport<DriverC> implements Competing {
    public Truck(String brand, String model, double engineCapacity, DriverC driverC) {
        super(brand, model, engineCapacity);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void pitStop(){
        System.out.println("Нужна остановка");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузового автмобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость");
    }
}
