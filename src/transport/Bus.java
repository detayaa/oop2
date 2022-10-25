package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int date, String country, String color) {
        super(brand, model, date, country, color);
    }

    public void bus() {
        System.out.println("Марка автобуса - " + brand + ", модель - " + model + ", год производства - " + date + ", цвет - " + color);
    }
}
