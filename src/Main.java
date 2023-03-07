import driver.*;
import transport.*;

public class Main {
    public static void main(String[] args) {
        DriverB driverB1 = new DriverB("Петров Василий Иванович", true, 12);
        DriverB driverB2 = new DriverB("Круглов Василий Иванович", true, 15);
        DriverB driverB3 = new DriverB("Серов Василий Иванович", true, 11);
        DriverB driverB4 = new DriverB("Котов Василий Иванович", true, 22);

        DriverC driverC1 = new DriverC("Климов Иван Иванович", true, 16);
        DriverC driverC2 = new DriverC("Сидоров Иван Иванович", true, 23);
        DriverC driverC3 = new DriverC("Иванцов Иван Иванович", true, 32);
        DriverC driverC4 = new DriverC("Кузнецов Иван Иванович", true, 21);

        DriverD driverD1 = new DriverD("Василенко Иван Иванович", true, 13);
        DriverD driverD2 = new DriverD("Игнатенок Иван Иванович", true, 11);
        DriverD driverD3 = new DriverD("Крюков Иван Иванович", true, 24);
        DriverD driverD4 = new DriverD("Сидоров Иван Иванович", true, 14);
        Transport<?>[] transports = {
                new Car("Audi", "A8 50 L TDI quattro", 3.2, driverB1, Car.BodyType.CROSSOVER),
                new Car("Kia", "Sportage 4-го поколения", 2.4, driverB2, Car.BodyType.HATCHCACK),
                new Car("Kia", "Sportage 4-го поколения", 2.4, driverB3, Car.BodyType.MINIVAN),
                new Car("Hyundai", "Avante", 1.6, driverB4, Car.BodyType.PICKUP),

                new Bus("Волжанин", "городской", 3.0, driverD1, Bus.Capacity.SO_LITTLE ),
                new Bus("BMW", "120", 4.2, driverD2, Bus.Capacity.AVERAGE),
                new Bus("Mercedes", "s12", 5.0, driverD3, Bus.Capacity.LARGE),
                new Bus("Mercedes", "s25", 5.5, driverD4, Bus.Capacity.VERY_LARGE),

                new Truck("Volvo", "North", 12.8, driverC1, Truck.LoadCapacity.N3),
                new Truck("Mercedes", "Europe", 14.2, driverC2, Truck.LoadCapacity.N1),
                new Truck("Mercedes", "S12", 15.6, driverC3, Truck.LoadCapacity.N2),
                new Truck("Volvo", "Europe North", 16.1, driverC4, Truck.LoadCapacity.N2)};

        for (Transport<?> transport : transports){
            System.out.println(transport);
        }
        for (Transport<?> transport : transports) {
            System.out.println("Водитель: " + transport.getDriver().getFullName() + ", управляет автомобилем: "
                    + transport.getBrand() + " " + transport.getModel() + " вид транспорта: " + transport.getType() +
                    " и будет участвовать в заезде");
        }
        transports[1].printType();
    }
}

