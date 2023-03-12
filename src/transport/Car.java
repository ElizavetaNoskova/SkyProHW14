package transport;

import driver.Driver;
import driver.DriverB;

import java.util.List;


public class Car extends Transport<DriverB> implements Competing {
    public enum BodyType {
        SEDAN("Cедан"),
        HATCHCACK("Хэтчбэк"),
        COUPE("Купе"),
        ESTATE("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public String toString() {
            return " Тип кузова:" + bodyType + ".";
        }
    }

    BodyType bodyType;

    public Car(String brand, String model, double engineCapacity, DriverB driverB, BodyType bodyType, List<Mechanic> mechanicList) {
        super(brand, model, engineCapacity, mechanicList);
        this.bodyType = bodyType;
    }

    @Override
    public void pitStop() {
        System.out.println("Нужна остановка");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга легкового автмобиля");
    }

    @Override
    public void maxSpeed() {
        double minBound = 100;
        double maxBound = 200;
        double maxSpeed = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Максимальная скорость" + maxSpeed);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public Type getType() {
        return Type.CAR;
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
        return super.toString() + bodyType;
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " проходит диагностику");
    }
}



