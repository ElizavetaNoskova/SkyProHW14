package transport;

import driver.*;

import java.util.List;

public abstract class Transport<D extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineCapacity;
    private D driver;
    private Type type;
    private final List<Mechanic> mechanicList;
    // private final int yearOfTheCar;
    // private final String countryOfProduction;
    //String bodyColor;
    //int maxSpeed;

    public Transport(String brand, String model,
                     double engineCapacity, List<Mechanic> mechanicList) {
        if (brand.isEmpty() || brand == null) {
            brand = "default";
        }
        this.brand = brand;
        if (model.isEmpty() || model == null) {
            model = "default";
        }
        this.model = model;
        if (engineCapacity <= 0.0) {
            engineCapacity = 1.6;
        }
        this.engineCapacity = engineCapacity;
        setDriver(driver);
        this.mechanicList = mechanicList;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "transport.Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public void startMoving() {

    }

    public void endMoving() {

    }

    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        this.driver = driver;
    }

    public Type getType() {
        return this.type;
    }

    public abstract void printType();

    public abstract void passDiagnostics() throws TransportTypeException;

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }
}
