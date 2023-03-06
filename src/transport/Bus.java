package transport;

import driver.Driver;
import driver.DriverD;

public class Bus extends Transport<DriverD> implements Competing {
    Capacity capacity;
    public Bus(String brand, String model,
               double engineCapacity, DriverD driverD1, Capacity capacity) {
        super(brand, model, engineCapacity);
        this.capacity = capacity;
    }

    enum Capacity {
        SO_LITTLE(null, 10),
        LITTLE(10, 25),
        AVERAGE(25, 50),
        LARGE(50, 80),
        VERY_LARGE(80, 120);
        Integer lowerBound;
        Integer upperBound;

        Capacity(Integer lowerBound, Integer upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }


        @Override
        public String toString() {
            return "Вместимость "+(lowerBound == null ? " " : " от  " + String.valueOf(lowerBound)) +
                    (upperBound == null ? " " : " до  " + String.valueOf(upperBound));
        }
    }

    @Override
    public void pitStop() {
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
    @Override
    public Type getType() {
        return Type.BUS;
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

