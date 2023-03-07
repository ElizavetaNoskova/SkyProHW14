package transport;

import driver.*;

public abstract class Transport<D extends Driver> implements Competing{
    private String brand;
    private String model;
    private double engineCapacity;
    private D driver;
    private Type type;
    // private final int yearOfTheCar;
    // private final String countryOfProduction;
    //String bodyColor;
    //int maxSpeed;

    public Transport(String brand, String model,
                     double engineCapacity) {
        if (brand.isEmpty() || brand == null) {
            brand = "default";
        }
        this.brand = brand;
        if (model.isEmpty() || model == null) {
            model = "default";
        }
        this.model = model;
        if ( engineCapacity <= 0.0) {
            engineCapacity = 1.6;
        }
        this.engineCapacity = engineCapacity;
        setDriver(driver);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
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

    public void startMoving(){

    }
    public void endMoving(){

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
}
