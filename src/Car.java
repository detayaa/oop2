public class Car {
    String brand;
    String model;
    double sizeEngine;
    String color;
    int date;
    String country;



    Car(String brand,String model, int date, String country, String color, double sizeEngine) {
        if (brand == null) {
            this.brand = "default";
        } else { this.brand = brand;}
        if (model == null) {
            this.model = "default";
        } else{ this.model = model;}

        this.date = date;
        this.color = color;
        if (country == null) {
            this.country = "default";
        } else { this.country = country;}
        this.sizeEngine = sizeEngine;
    }

    void information() {
        System.out.println(brand + " " + model + ", " + date + " год выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя - " + sizeEngine + " л." );
    }
}
