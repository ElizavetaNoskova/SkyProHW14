package driver;

public class DriverC extends Driver implements Skills{
    public DriverC(String fullName, boolean haveDriverLicense, int experience) {
        super(fullName, haveDriverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель грузового автомобиля " + getFullName() + " начал движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель грузового автомобиля "+ getFullName()+"закончил движение.");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель грузового автомобиля "+ getFullName()+" заправляет автомобиль.");
    }
    @Override
    public String toString() {
        return "Водитель категории C: " + super.toString();
    }
}
