package transport;

import java.sql.SQLOutput;

public class Driver<B extends Transport & Competing> {

    private final String name;
    private String license;
    private final int experience;

    public Driver(String name, String license, int experience) {
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
        setLicense(license);
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


    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        if (license == null && license.isEmpty() && license.isBlank()) {
            throw new IllegalArgumentException("Необходимо иметь права");
        }
        this.license = license;

    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
}
