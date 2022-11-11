package transport;

public class Sponsor<C extends Transport & Competing> {
    private String name;
    private int summa;

    public Sponsor(String name, int summa) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            name = "Введено некорректно";
        }

        if (summa != 0) {
            this.summa = summa;
        } else {
            summa = 100000;
        }
    }

    public void sponsor(C transport) {
        System.out.println("Спонсор - " + name + ", с суммой - " + summa);
    }

    public void finance() {
        System.out.println("Спонсирую заезд");
    }

    public String getName() {
        return name;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }
}
