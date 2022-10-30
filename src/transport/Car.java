package transport;


public class Car extends Transport implements Competing {

    public static final String PIT_STOP = "PIT STOP";





    public Car(String brand, String model, double sizeEngine) {
        super(brand, model, sizeEngine);
    }

    public void information() {
        System.out.println("Бренд легкогого автомобиля - " + brand + ", модель -  " + model + ", объем двигателя -  " + sizeEngine);

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
        System.out.println("Лучшее время - 3:21");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость - 200");
    }
}


