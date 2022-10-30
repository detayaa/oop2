import transport.*;
//import transport.Train;

public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", "488", 3.9);
        ferrari.information();
        ferrari.maxSpeed();
        ferrari.bestTime();
        ferrari.pitStop();
        Car kia = new Car("Kia", "Sportage", 2);
        kia.information();
        kia.maxSpeed();
        kia.bestTime();
        kia.pitStop();
        Car honda = new Car("Honda", "CR-V", 2.4);
        honda.information();
        honda.maxSpeed();
        honda.bestTime();
        honda.pitStop();
        Car mazda = new Car("Mazda", "CX-5", 2);
        mazda.information();
        mazda.maxSpeed();
        mazda.bestTime();
        mazda.pitStop();
        Bus maz = new Bus("Maz", "203", 6.37);
        maz.information();
        maz.maxSpeed();
        maz.bestTime();
        maz.pitStop();
        Bus neman = new Bus("Neman", "4202", 3.0);
        neman.information();
        neman.maxSpeed();
        neman.bestTime();
        neman.pitStop();
        Bus volvo = new Bus("Volvo", "7900", 2.4);
        volvo.information();
        volvo.maxSpeed();
        volvo.bestTime();
        volvo.pitStop();
        Bus paz = new Bus("Paz", "3010", 2.5);
        paz.information();
        paz.maxSpeed();
        paz.bestTime();
        paz.pitStop();
        Truck mercedes = new Truck("Mercedes Benz", "Actros", 15.6);
        mercedes.information();
        mercedes.maxSpeed();
        mercedes.bestTime();
        mercedes.pitStop();
        Truck man = new Truck("Man", "TGX", 12.4);
        man.information();
        man.maxSpeed();
        man.bestTime();
        man.pitStop();
        Truck scania = new Truck("Scania", "Super", 13);
        scania.information();
        scania.maxSpeed();
        scania.bestTime();
        scania.pitStop();
        Truck tatra = new Truck("Tatra", "T163", 13);
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


    }


}
