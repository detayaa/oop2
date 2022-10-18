public class Car {
    String brand;
    String model;
    double sizeEngine;
    String color;
    int date;
    String country;



    Car(String brand,String model, int date, String country, String color, double sizeEngine) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else { this.brand = brand;}

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else{ this.model = model;}

        if (date == 0) {
            this.date = 2000;
        } else { this.date = date;}

        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else { this.color = color;}

        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else { this.country = country;}

        if (sizeEngine == 0) {
            this.sizeEngine = 1.5;
        } else { this.sizeEngine = sizeEngine;}
    }

    void information() {
        System.out.println(brand + " " + model + ", " + date + " год выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя - " + sizeEngine + " л." );
    }
}
