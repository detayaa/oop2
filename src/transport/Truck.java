package transport;

public class Truck extends Transport implements Competing {
    public Truck(String model, String brand, double sizeEngine) {
        super(model, brand, sizeEngine);
    }

    public void information() {
        System.out.println("Бренд грузового автомобиля - " + brand + ", модель -  " + model + ", обём двигателя " + sizeEngine);
    }


    @Override
    public void go() {
        super.go();
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-Стоп");

    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время - 5:12");

    }


    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость - 189");

    }
}
