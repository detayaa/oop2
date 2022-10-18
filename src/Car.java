public class Car {
    String brand;
    String model;
    double sizeEngine;
    String color;
    int date;
    String country;



    Car(String brand, int date, String country, String color, double sizeEngine) {
        this.brand = brand;
        this.date = date;
        this.color = color;
        this.country = country;
        this.sizeEngine = sizeEngine;
    }

    void information() {
        System.out.println(brand + ", " + date + " год выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя - " + sizeEngine + " л." );
    }
}
