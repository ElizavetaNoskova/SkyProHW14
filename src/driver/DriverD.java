package driver;

public class DriverD extends Driver implements Skills{
    public DriverD(String fullName, boolean haveDriverLicense, int experience) {
        super(fullName, haveDriverLicense, experience);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stopMoving() {

    }

    @Override
    public void refuelCar() {

    }
    @Override
    public String toString() {
        return "Водитель категории D" + super.toString();
    }
}
