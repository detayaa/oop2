public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada Granta", 2015, "России", "желтого", 1.7);
        lada.information();
        Car audi = new Car("Audi A8 50 L TDI quattro", 2020, "Германии", "черного", 3.0);
        audi.information();
        Car bmw = new Car("BMW Z8", 2021, "Гермнии", "черного", 2.4);
        bmw.information();
        Car kia = new Car("Kia Sportage 4-го поколения", 2018, "Южной Корее", "красного", 2.4);
        kia.information();
        Car hyundai = new Car("Hyundai Avante", 2016, "Южной Корее", "оранжевого", 1.6);
        hyundai.information();


    }
}
