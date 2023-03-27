package driver;
import java.util.Objects;

public class Driver {
    private String fullName;
    private boolean haveDriverLicense;
    private int experience;

    public Driver(String fullName, boolean haveDriverLicense, int experience) {
        this.fullName = fullName;
        this.haveDriverLicense = haveDriverLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
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
        return fullName + (haveDriverLicense ? ", водительские права есть" : ", водительских прав нет" +
                ", опыт вождения " + experience + " лет.");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return haveDriverLicense == driver.haveDriverLicense && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, haveDriverLicense, experience);
    }
}

