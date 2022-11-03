package transport;

import java.util.Arrays;

public class Bus extends Transport implements Competing {

    public enum Capacity{
        ESPECIALLY_SMALL(0,10), SMALL(0,25), AVERAGE(40,50), BIG(60,80) , ESPECIALLY_BIG(100,120);

        final int maxCapacity;
        final int minCapacity;
        Capacity(int minCapacity, int maxCapacity) {
            this.maxCapacity = maxCapacity;
            this.minCapacity = minCapacity;
        }

        public int getMaxCapacity() {
            return maxCapacity;
        }

        public int getMinCapacity() {
            return minCapacity;
        }
    }
    public Bus(String brand, String model, double sizeEngine, Capacity capacity) {
        super(brand, model, sizeEngine);
    }

    public void information() {
        System.out.println("Марка автобуса - " + brand + ", модель - " + model + ", объем двигателя - " + sizeEngine + Arrays.toString(Capacity.values()));
    }


  public void printType(Capacity capacity) {
        switch (capacity) {
            case ESPECIALLY_SMALL:
                System.out.println(brand + ", вместимость от " + capacity.minCapacity + " до " + capacity.maxCapacity + " человек ");
                break;
            case SMALL:
                System.out.println(brand + ", вместимость от " + capacity.minCapacity + " до " + capacity.maxCapacity + " человек ");
                break;
            case AVERAGE:
                System.out.println(brand + ", вместимость от " + capacity.minCapacity + " до " + capacity.maxCapacity + " человек ");
                break;
            case BIG:
                System.out.println(brand + ", вместимость от " + capacity.minCapacity + " до " + capacity.maxCapacity + " человек ");
                break;
            case ESPECIALLY_BIG:
                System.out.println(brand + ", вместимость от " + capacity.minCapacity + " до " + capacity.maxCapacity + " человек ");
                break;
        }

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
