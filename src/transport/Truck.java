package transport;

import java.util.Arrays;

public class Truck extends Transport implements Competing {

    String capacity;
    public enum LoadCapacity{
        N1(0,3.5),N2(3.5,12),N3(12,100);
        double maxWeight;
        double minWeight;

        LoadCapacity(double minWeight, double maxWeight) {
            if (maxWeight != 0) {
                this.maxWeight = maxWeight;
            }
            if (minWeight != 0) {
                this.minWeight = minWeight;
            }
        }



        public double getMaxWeight() {
            return maxWeight;
        }

        public double getMinWeight() {
            return minWeight;
        }
    }
    public Truck(String model, String brand, double sizeEngine) {
        super(model, brand, sizeEngine);
    }

    public void information() {
        System.out.println("Бренд грузового автомобиля - " + brand + ", модель -  " + model + ", обём двигателя " + sizeEngine);
    }



    public void printType(LoadCapacity loadCapacity){
        switch (loadCapacity){
            case N1:
                System.out.println(brand + ", грузоподъемность от " + loadCapacity.minWeight + " до " + loadCapacity.maxWeight);
                break;
            case N2:
                System.out.println(brand + ", грузоподъемность от " + loadCapacity.minWeight + " до " + loadCapacity.maxWeight);
                break;
            case N3:
                System.out.println(brand + ", грузоподъемность от " + loadCapacity.minWeight + " до " + loadCapacity.maxWeight);
                break;
        }


    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.75;

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
