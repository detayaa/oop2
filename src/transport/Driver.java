package transport;

import java.sql.SQLOutput;

public class Driver<B extends Transport & Competing> {

    private final String name;
    private boolean license;
    private final int experience;

    public Driver(String name, boolean license, int experience) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Указано неккоректно";
        }

        if (experience != 0) {
            this.experience = experience;
        } else {
            this.experience = 2;
        }
    }

    public void start() {
        System.out.println("Начинаю движение");
    }

    public void stop() {
        System.out.println("Останавливаюсь");
    }

    public void refil() {
        System.out.println("Заправляюсь");
    }


    public void drive(B transport) {
        System.out.println("водитель " + getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");

    }


    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
}
