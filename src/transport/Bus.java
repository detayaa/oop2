package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int date, String country, String color,int maxSpeed) {
        super(brand, model, date, country, color, maxSpeed);
    }

    @Override
    public void refil() {
        System.out.println("Заправлять дизелем или бензином на заправке");
    }

    public void bus() {
        System.out.println("Марка автобуса - " + brand + ", модель - " + model + ", год производства - " + date + ", цвет - " + color + ", максимальная скорость - " + maxSpeed);
    }
}
