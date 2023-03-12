package transport;

import driver.Driver;
import driver.DriverD;

import java.util.List;

public class Bus extends Transport<DriverD> implements Competing {
    Capacity capacity;
    List<Mechanic> busMechanicsList;

    public Bus(String brand, String model,
               double engineCapacity, DriverD driverD1, Capacity capacity, List<Mechanic> mechanicList) {
        super(brand, model, engineCapacity, mechanicList);
        this.capacity = capacity;
    }


    public enum Capacity {
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
            return " Вместимость " + (lowerBound == null ? " " : " от  " + String.valueOf(lowerBound)) +

                    (upperBound == null ? " " : " до  " + String.valueOf(upperBound));
        }
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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

    @Override
    public String toString() {
        return super.toString() + capacity;
    }


    @Override
    public void passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException();
    }


}

