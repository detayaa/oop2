import transport.*;
//import transport.Train;

public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", "488", 3.9, Car.Body.MINIVAN);
        ferrari.information();
        ferrari.maxSpeed();
        ferrari.bestTime();
        ferrari.pitStop();
        Car kia = new Car("Kia", "Sportage", 2, Car.Body.VAN);
        kia.information();
        kia.maxSpeed();
        kia.bestTime();
        kia.pitStop();
        Car honda = new Car("Honda", "CR-V", 2.4, Car.Body.SUV);
        honda.information();
        honda.maxSpeed();
        honda.bestTime();
        honda.pitStop();
        Car mazda = new Car("Mazda", "CX-5", 2, Car.Body.UNIVERSAL);
        mazda.information();
        mazda.maxSpeed();
        mazda.bestTime();
        mazda.pitStop();
        Bus maz = new Bus("Maz", "203", 6.37, Bus.Capacity.SMALL);
        maz.information();
        maz.maxSpeed();
        maz.bestTime();
        maz.pitStop();
        Bus neman = new Bus("Neman", "4202", 3.0, Bus.Capacity.ESPECIALLY_SMALL);
        neman.information();
        neman.maxSpeed();
        neman.bestTime();
        neman.pitStop();
        Bus volvo = new Bus("Volvo", "7900", 2.4, Bus.Capacity.BIG);
        volvo.information();
        volvo.maxSpeed();
        volvo.bestTime();
        volvo.pitStop();
        Bus paz = new Bus("Paz", "3010", 2.5, Bus.Capacity.AVERAGE);
        paz.information();
        paz.maxSpeed();
        paz.bestTime();
        paz.pitStop();
        Truck mercedes = new Truck("Mercedes Benz", "Actros", 15.6, Truck.LoadCapacity.N1);
        mercedes.information();
        mercedes.maxSpeed();
        mercedes.bestTime();
        mercedes.pitStop();
        Truck man = new Truck("Man", "TGX", 12.4, Truck.LoadCapacity.N2);
        man.information();
        man.maxSpeed();
        man.bestTime();
        man.pitStop();
        Truck scania = new Truck("Scania", "Super", 13, Truck.LoadCapacity.N3);
        scania.information();
        scania.maxSpeed();
        scania.bestTime();
        scania.pitStop();
        Truck tatra = new Truck("Tatra", "T163", 13, Truck.LoadCapacity.N2);
        tatra.information();
        tatra.maxSpeed();
        tatra.bestTime();
        tatra.pitStop();


        Driver<Car> smith = new Driver<>("Smith", true, 5);
        smith.drive(kia);
        smith.start();
        smith.stop();
        smith.refil();

        Driver<Bus> carl = new Driver<>("Carl", true, 3);
        carl.drive(paz);
        carl.start();
        carl.start();
        carl.refil();

        Driver<Truck> harry = new Driver<>("Harry", true, 6);
        harry.drive(scania);
        harry.start();
        harry.stop();
        harry.refil();

        scania.printType(Truck.LoadCapacity.N1);
        mercedes.printType(Truck.LoadCapacity.N2);
        tatra.printType(Truck.LoadCapacity.N3);

        paz.printType(Bus.Capacity.SMALL);
        maz.printType(Bus.Capacity.BIG);
        neman.printType(Bus.Capacity.ESPECIALLY_SMALL);

        ferrari.go(Car.Body.VAN);
        kia.go(Car.Body.MINIVAN);
        honda.go(Car.Body.HATCHBACK);








    }


}
