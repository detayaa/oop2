import transport.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", "488", 3.9);
        ferrari.information();
        ferrari.maxSpeed();
        ferrari.bestTime();
        ferrari.pitStop();
        ferrari.go(Car.Body.VAN);

        Car kia = new Car("Kia", "Sportage", 2);
        kia.information();
        kia.maxSpeed();
        kia.bestTime();
        kia.pitStop();
        ferrari.go(Car.Body.MINIVAN);

        Car honda = new Car("Honda", "CR-V", 2.4);
        honda.information();
        honda.maxSpeed();
        honda.bestTime();
        honda.pitStop();

        ferrari.go(Car.Body.UNIVERSAL);
        Car mazda = new Car("Mazda", "CX-5", 2);
        mazda.information();
        mazda.maxSpeed();
        mazda.bestTime();
        mazda.pitStop();
        ferrari.go(Car.Body.PICKUP);

        Bus maz = new Bus("Maz", "203", 6.37);
        maz.information();
        maz.maxSpeed();
        maz.bestTime();
        maz.pitStop();
        maz.printType(Bus.Capacity.BIG);

        Bus neman = new Bus("Neman", "4202", 3.0);
        neman.information();
        neman.maxSpeed();
        neman.bestTime();
        neman.pitStop();
        neman.printType(Bus.Capacity.ESPECIALLY_BIG);

        Bus volvo = new Bus("Volvo", "7900", 2.4);
        volvo.information();
        volvo.maxSpeed();
        volvo.bestTime();
        volvo.pitStop();
        volvo.printType(Bus.Capacity.ESPECIALLY_SMALL);

        Bus paz = new Bus("Paz", "3010", 2.5);
        paz.information();
        paz.maxSpeed();
        paz.bestTime();
        paz.pitStop();
        paz.printType(Bus.Capacity.SMALL);

        Truck mercedes = new Truck("Mercedes Benz", "Actros", 15.6);
        mercedes.information();
        mercedes.maxSpeed();
        mercedes.bestTime();
        mercedes.pitStop();
        mercedes.printType(Truck.LoadCapacity.N1);

        Truck man = new Truck("Man", "TGX", 12.4);
        man.information();
        man.maxSpeed();
        man.bestTime();
        man.pitStop();
        man.printType(Truck.LoadCapacity.N2);

        Truck scania = new Truck("Scania", "Super", 13);
        scania.information();
        scania.maxSpeed();
        scania.bestTime();
        scania.pitStop();
        scania.printType(Truck.LoadCapacity.N1);

        Truck tatra = new Truck("Tatra", "T163", 13);
        tatra.information();
        tatra.maxSpeed();
        tatra.bestTime();
        tatra.pitStop();
        tatra.printType(Truck.LoadCapacity.N3);


        Driver<Car> smith = new Driver<>("Smith", "права есть", 5);
        Sponsor<Car> oookia = new Sponsor<>("oookia", 2000000);
        Mechanic<Car> lack = new Mechanic<>("lack", "jin", "car");
        lack.mechanic(kia);
        smith.drive(kia);
        oookia.sponsor(kia);
        smith.start();
        smith.stop();
        smith.refil();
        oookia.finance();
        lack.fix();
        lack.service();


        Driver<Bus> carl = new Driver<>("Carl", "права есть", 3);
        Sponsor<Bus> roman = new Sponsor<>("roman", 2000500);
        Mechanic<Bus> jack = new Mechanic<>("jack", "jin", "truck, bus");
        jack.mechanic(paz);
        roman.sponsor(paz);
        carl.drive(paz);
        carl.start();
        carl.start();
        carl.refil();
        roman.finance();
        jack.service();
        jack.fix();

        Driver<Truck> harry = new Driver<>("Harry", " ", 6);
        Sponsor<Truck> tom = new Sponsor<>("roman", 2000510);
        Mechanic<Truck> sara = new Mechanic<>("jack", "jin", "truck, bus");
        sara.mechanic(scania);
        tom.sponsor(scania);
        harry.drive(scania);
        harry.start();
        harry.stop();
        harry.refil();
        tom.finance();
        sara.fix();
        sara.service();

        Driver<Car> kirill = new Driver<>("kirill", "права есть", 8);
        Sponsor<Car> georg = new Sponsor<>("georg", 4000500);
        Mechanic<Car> tack = new Mechanic<>("tack", "jin", "Car");
        tack.mechanic(ferrari);
        georg.sponsor(ferrari);
        kirill.drive(ferrari);
        georg.finance();
        tack.fix();
        tack.service();

        Driver<Car> evgine = new Driver<>("evgine", "права есть", 12);
        Sponsor<Car> valeria = new Sponsor<>("roman", 2000500);
        Mechanic<Car> cookie = new Mechanic<>("cookie", "cookie", "car");
        cookie.mechanic(honda);
        valeria.sponsor(honda);
        evgine.drive(honda);
        valeria.finance();
        cookie.fix();
        cookie.service();

        Driver<Car> nastya = new Driver<>("nastya", "права есть", 13);
        Sponsor<Car> calm = new Sponsor<>("calm", 2700500);
        Mechanic<Car> jin = new Mechanic<>("jin", "jin", "car");
        jin.mechanic(mazda);
        calm.sponsor(mazda);
        nastya.drive(mazda);
        calm.finance();
        jin.fix();
        jin.service();

        Driver<Bus> josh = new Driver<>("josh", "права есть", 26);
        Sponsor<Bus> carry = new Sponsor<>("carry", 7000500);
        Mechanic<Bus> larry = new Mechanic<>("larry", "jin", "bus");
        larry.mechanic(volvo);
        carry.sponsor(volvo);
        josh.drive(volvo);
        carry.finance();
        larry.fix();
        lack.service();

        Driver<Bus> karl = new Driver<>("karl", "права есть", 8);
        Sponsor<Bus> lorry = new Sponsor<>("lorry", 2000500);
        Mechanic<Bus> mike = new Mechanic<>("mike", "jin", "bus");
        mike.mechanic(neman);
        lorry.sponsor(neman);
        karl.drive(neman);
        lorry.finance();
        mike.fix();
        mike.service();

        Driver<Truck> moddy = new Driver<>("moddy", "права есть", 21);
        Sponsor<Truck> god = new Sponsor<>("god", 1000500);
        Mechanic<Truck> kesha = new Mechanic<>("kesha", "kesha", "truck");
        kesha.mechanic(mercedes);
        god.sponsor(mercedes);
        moddy.drive(mercedes);
        god.finance();
        kesha.service();
        kesha.fix();

        Driver<Truck> olga = new Driver<>("olga", "права есть", 16);
        Sponsor<Truck> gods = new Sponsor<>("god", 2000500);
        Mechanic<Truck> kitty = new Mechanic<>("kitty", "kitty", "truck");
        kitty.mechanic(man);
        gods.sponsor(man);
        olga.drive(man);
        gods.finance();
        kitty.fix();
        kitty.service();


        diagnostics(honda, kia, ferrari, scania, neman, mercedes, man, maz, mazda, paz);

        System.out.println(check("OQWE1234_", "123ertgfdv", "123ertgfdv"));

        Set<Object> allCar = new HashSet<>();
        allCar.add(ferrari);
        allCar.add(kia);
        allCar.add(man);
        allCar.add(mazda);
        allCar.add(maz);
        allCar.add(harry);
        allCar.add(honda);
        allCar.add(paz);
        allCar.add(neman);
        allCar.add(tatra);
        allCar.add(scania);
        allCar.add(mercedes);
        allCar.add(volvo);

        ServiceStation<Transport> service = new ServiceStation<>();
        service.addCar(ferrari);
        service.addCar(man);
        service.addCar(maz);
        service.addCar(mazda);
        service.addCar(honda);
        service.addCar(mercedes);
        service.addCar(kia);

        service.service();

        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();

        randomFilling(queue1);
        randomFilling(queue2);

        System.out.println("Первая очередь " + queue1);
        System.out.println("Вторая очередь " + queue2);

        add("Max",queue1,queue2);
        System.out.println("Первая очередь " + queue1);
        System.out.println("Вторая очередь " + queue2);

        add("Igor",queue1,queue2);
        System.out.println("Первая очередь " + queue1);
        System.out.println("Вторая очередь " + queue2);

        remove(queue1,queue2);
        System.out.println("Первая очередь " + queue1);
        System.out.println("Вторая очередь " + queue2);

        example();

    }



    private static void add(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() < queue2.size() && queue2.size() != MAX_SIZE) {
            queue1.offer(name);
        } else if (queue2.size() < queue1.size() && queue1.size() != MAX_SIZE) {
            queue2.offer(name);
        } else {
            System.out.println("Позовите Галю");
        }
    }

    private static void remove(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }


    }

    private static final List<String> NAMES = List.of(
            "Ivan",
            "Petr",
            "Anton",
            "Alex",
            "Sasha",
            "Roma",
            "Nadya",
            "Gennadiy"
    );
    private static final int MAX_SIZE = 5;

    private static Random RANDOM = new Random();
    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));

        }
    }

    public static boolean check(String login, String password, String confirmPassword) {
        try {
            return Data.check(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка при валидации логина: " + e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка при валидации пароля" + e.getMessage());
            return false;
        }
    }


    private static void diagnostics(Transport... transports) {
        for (Transport transport : transports) {
            diagnosticsTransport(transport);
        }
    }

    private static void diagnosticsTransport(Transport transport) {
        try {
            if (!transport.diagnostics()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, ((i + j) % 2 == 1 ? "●" : "◯"));
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
        }
    }


}
