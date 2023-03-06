package transport;

import driver.Driver;
import driver.DriverC;

public class Truck extends Transport<DriverC> implements Competing {
    LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineCapacity, DriverC driverC,
                 LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    public enum LoadCapacity {
        N1(null, 3.5F),
        N2(3.5F, 12F),
        N3(12F, null);
        private Float upperBound;
        private Float lowerBound;

        LoadCapacity(Float lowerBound, Float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }


        @Override
        public String toString() {
            return "Грузоподъемность " + (lowerBound == null ? " " : " от " + String.valueOf(lowerBound)) +
                    (upperBound == null ? " " : " до " + String.valueOf(upperBound)) +
                    '}';
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void pitStop() {
        System.out.println("Нужна остановка");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузового автмобиля");
    }

    @Override
    public void maxSpeed() {
        double minBound = 100;
        double maxBound = 200;
        double maxSpeed = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Максимальная скорость" + maxSpeed);
    }

    @Override
    public Type getType() {
        return Type.TRUCK;
    }

    @Override
    public void printType() {
        if (getType() != null) {
            System.out.println(getType());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}
