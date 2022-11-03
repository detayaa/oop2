package transport;


public class Car extends Transport implements Competing {

    public enum Body {SEDAN, HATCHBACK, COUPE, UNIVERSAL, SUV, CROSSOVER, PICKUP, VAN, MINIVAN}

    public Car(String brand, String model, double sizeEngine) {
        super(brand, model, sizeEngine);
    }

    public void information() {
        System.out.println("Бренд легкогого автомобиля - " + brand + ", модель -  " + model + ", объем двигателя -  " + sizeEngine);
    }


    public void go(Body body) {
        switch (body) {
            case SUV:
                System.out.println(brand + ", модель - " + body);
                break;
            case HATCHBACK:
                System.out.println(brand + ", модель - " + body);
                break;
            case COUPE:
                System.out.println(brand + ", модель - " + body);
                break;
            case CROSSOVER:
                System.out.println(brand + ", модель - " + body);
                break;
            case UNIVERSAL:
                System.out.println(brand + ", модель - " + body);
                break;
            case PICKUP:
                System.out.println(brand + ", модель - " + body);
                break;
            case MINIVAN:
                System.out.println(brand + ", модель - " + body);
                break;
            case VAN:
                System.out.println(brand + ", модель - " + body);
                break;
        }

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
    public void printType() {
        super.printType();
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


