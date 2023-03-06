package transport;

import driver.Driver;
import driver.DriverD;

public class Bus extends Transport<DriverD> implements Competing {
    public Bus(String brand, String model,
               double engineCapacity, DriverD driverD1){
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
        System.out.println("Лучшее время круга автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость");
    }
}
