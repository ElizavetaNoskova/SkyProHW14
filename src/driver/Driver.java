package driver;
import java.util.Objects;

public class Driver {
    private static String FullName;
    private boolean haveDriverLicense;
    private int experience;

    public Driver(String fullName, boolean haveDriverLicense, int experience) {
        FullName = fullName;
        this.haveDriverLicense = haveDriverLicense;
        this.experience = experience;
    }

    public static String getFullName() {
        return FullName;
    }

    public boolean isHaveDriverLicense() {
        return haveDriverLicense;
    }

    public void setHaveDriverLicense(boolean haveDriverLicense) {
        this.haveDriverLicense = haveDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return FullName + (haveDriverLicense ? ", водительские права есть" : ", водительских прав нет" +
                ", опыт вождения " + experience + " лет.");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return haveDriverLicense == driver.haveDriverLicense && experience == driver.experience && Objects.equals(FullName, driver.FullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FullName, haveDriverLicense, experience);
    }
}

