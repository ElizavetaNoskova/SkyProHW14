import driver.*;
import transport.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        DriverB driverB1 = new DriverB("Петров Василий Иванович", true, 12);
        DriverB driverB2 = new DriverB("Круглов Василий Иванович", true, 15);
        DriverB driverB3 = new DriverB("Серов Василий Иванович", true, 11);
        DriverB driverB4 = new DriverB("Котов Василий Иванович", true, 22);

        DriverC driverC1 = new DriverC("Климов Иван Иванович", true, 16);
        DriverC driverC2 = new DriverC("Сидоров Иван Иванович", true, 23);
        DriverC driverC3 = new DriverC("Носков Иван Иванович", true, 32);
        DriverC driverC4 = new DriverC("Кузнецов Иван Иванович", true, 21);

        DriverD driverD1 = new DriverD("Василенко Иван Иванович", true, 13);
        DriverD driverD2 = new DriverD("Игнатенок Иван Иванович", true, 11);
        DriverD driverD3 = new DriverD("Крюков Иван Иванович", true, 24);
        DriverD driverD4 = new DriverD("Котиков Иван Иванович", true, 14);

        Mechanic mechanic1 = new Mechanic("Сидоров Пётр", "ProMechanics");
        Mechanic mechanic2 = new Mechanic("Венцов Сергей", "F1 mech. company");
        Mechanic mechanic3 = new Mechanic("Кривко Руслан", "Bus mechanics");
        Mechanic mechanic4 = new Mechanic("Петров Василий", "Truck mehPro");

        List<Mechanic> mechanicList = new ArrayList<>();
        mechanicList.add(mechanic1);
        mechanicList.add(mechanic2);
        mechanicList.add(mechanic3);
        mechanicList.add(mechanic4);

        Transport<?>[] transports = {
                new Car("Audi", "A8 50 L TDI quattro", 3.2, driverB1, Car.BodyType.CROSSOVER, mechanicList),
                new Car("Kia", "Sportage 4-го поколения", 2.4, driverB2, Car.BodyType.HATCHCACK, mechanicList),
                new Car("Kia", "Sportage 4-го поколения", 2.4, driverB3, Car.BodyType.MINIVAN, mechanicList),
                new Car("Hyundai", "Avante", 1.6, driverB4, Car.BodyType.PICKUP, mechanicList),

                new Bus("Волжанин", "городской", 3.0, driverD1, Bus.Capacity.SO_LITTLE, mechanicList),
                new Bus("BMW", "120", 4.2, driverD2, Bus.Capacity.AVERAGE, mechanicList),
                new Bus("Mercedes", "s12", 5.0, driverD3, Bus.Capacity.LARGE, mechanicList),
                new Bus("Mercedes", "s25", 5.5, driverD4, Bus.Capacity.VERY_LARGE, mechanicList),

                new Truck("Volvo", "North", 12.8, driverC1, Truck.LoadCapacity.N3, mechanicList),
                new Truck("Mercedes", "Europe", 14.2, driverC2, Truck.LoadCapacity.N1, mechanicList),
                new Truck("Mercedes", "S12", 15.6, driverC3, Truck.LoadCapacity.N2, mechanicList),
                new Truck("Volvo", "Europe North", 16.1, driverC4, Truck.LoadCapacity.N2, mechanicList)};
        for (Transport<?> transport : transports) {
            System.out.println(transport);
        }
        for (Transport<?> transport : transports) {
            System.out.println("Водитель: " + transport.getDriver().getFullName() + ", управляет автомобилем: "
                    + transport.getBrand() + " " + transport.getModel() + " вид транспорта: " + transport.getType() +
                    " и будет участвовать в заезде");
        }
        transports[1].printType();
        checkTransportDiagnostic(transports[1]);
        checkTransportDiagnostic(transports[5]);
        checkTransportDiagnostic(transports[8]);
        treansportInfo(transports[0]);
        System.out.println(Arrays.toString(transports));

        List<Transport<?>> transportsList = new ArrayList<>();
        transportsList.add(transports[0]);
        transportsList.add(transports[1]);
        transportsList.add(transports[2]);
        transportsList.add(transports[3]);
        transportsList.add(transports[4]);
        transportsList.add(transports[5]);
        transportsList.add(transports[6]);
        transportsList.add(transports[7]);
        transportsList.add(transports[8]);
        transportsList.add(transports[9]);
        transportsList.add(transports[10]);
        transportsList.add(transports[11]);

        Set<Driver> driversList = new HashSet<>();
        driversList.add(driverB1);
        driversList.add(driverB2);
        driversList.add(driverB3);
        driversList.add(driverB4);
        driversList.add(driverC1);
        driversList.add(driverC2);
        driversList.add(driverC3);
        driversList.add(driverC4);
        driversList.add(driverD1);
        driversList.add(driverD2);
        driversList.add(driverD3);
        driversList.add(driverD4);
        driversList.add(driverD4);
        System.out.println(driversList);
        System.out.println();

        Iterator<Driver> driverIterator = driversList.iterator();
        while (driverIterator.hasNext()) {
            System.out.println(driverIterator.next());
        }

        Map<Transport<?>, List<Mechanic>> hashMapTransport = new HashMap<>();
        hashMapTransport.put(transports[0], mechanicList);
        hashMapTransport.put(transports[1], mechanicList);
        hashMapTransport.put(transports[2], mechanicList);
        hashMapTransport.put(transports[3], mechanicList);
        for (Map.Entry<Transport<?>, List<Mechanic>> hash : hashMapTransport.entrySet()) {
            System.out.println("Водитель " + hash.getKey() + " :" + hash.getValue());
        }
        serviceStation serviceStation = new serviceStation();
        serviceStation.addTransport(transports[0]);
        serviceStation.addTransport(transports[1]);
        serviceStation.addTransport(transports[2]);
        serviceStation.addTransport(transports[3]);
        serviceStation.addTransport(transports[4]);
        serviceStation.addTransport(transports[5]);
        serviceStation.addTransport(transports[6]);
        serviceStation.addTransport(transports[7]);
        serviceStation.addTransport(transports[8]);
        serviceStation.addTransport(transports[9]);
        serviceStation.addTransport(transports[10]);
        serviceStation.addTransport(transports[11]);
    }


    public static void checkTransportDiagnostic(Transport<?> transport) {
        if (transport.getType().equals(Type.BUS)) {
            try {
                transport.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println("Автобусам не нужно проходить диагностику");
            }
        } else {
            try {
                transport.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println(" ");
            }
        }
    }


    public static void treansportInfo(Transport<?> transports) {
        System.out.println(transports.getBrand() + " " + transports.getModel() + " Водитель: " +
                transports.getDriver().getFullName() + " " + transports.getMechanicList());
    }
}


