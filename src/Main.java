import transport.Car;

public class Main {
    public static void main(String[] args) {
        new Car.Insurance(2022,132,123);


        Car lada = new Car("Lada", "Granta", 2015, "России", "желтого", 1.7,"не знаю","какойто","123",4,"летняя");
        lada.information();
        lada.setInsurance();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черного", 3.0,"не знаю","какойто","123",4,"летняя");
        audi.information();
        audi.setInsurance();
        Car bmw = new Car("BMW", "Z8", 2021, "Германии", "черного", 2.4,"не знаю","какойто","123",4,"летняя");
        bmw.information();
        bmw.setInsurance();
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красного", 2.4,"не знаю","какойто","123",4,"летняя");
        kia.information();
        kia.setInsurance();
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевого", 1.6,"не знаю","какойто","123",4,"летняя");
        hyundai.information();
        hyundai.setInsurance();


    }


}
