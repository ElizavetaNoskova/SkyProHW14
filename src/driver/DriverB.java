package driver;

public class DriverB extends Driver implements Skills {
    public DriverB(String fullName, boolean haveDriverLicense, int experience) {
        super(fullName, haveDriverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель легкового автомобиля " + getFullName() + " начал движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель легкового автомобиля " + getFullName() + " закончил движение.");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель легкового автомобиля " + getFullName() + " заправляет автомобиль.");
    }

    @Override
    public String toString() {
        return "Водитель категории В" + super.toString();
    }
}
