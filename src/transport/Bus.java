package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double sizeEngine) {
        super(brand, model, sizeEngine);
    }

    public void information() {
        System.out.println("Марка автобуса - " + brand + ", модель - " + model + ", объем двигателя - " + sizeEngine);
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
        System.out.println("Лучшее время - 4:23");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость - 178");

    }
}
