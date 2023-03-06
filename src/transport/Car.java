package transport;

import driver.Driver;
import driver.DriverB;


public class Car extends Transport<DriverB> implements Competing {
    public Car(String brand, String model, double engineCapacity, DriverB driverB) {
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
        System.out.println("Лучшее время круга легкового автмобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость");
    }
}
