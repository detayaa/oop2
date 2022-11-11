package transport;

public class Mechanic<T extends Transport & Competing> {
    private String name;
    private String company;
    private String typeCar;

    public Mechanic(String name, String company, String typeCar) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            name = "Введено некорректно";
        }
        if (company != null && !company.isBlank() && !company.isEmpty()) {
            this.company = company;
        } else {
            company = "Введено некорректно";
        }
        if (typeCar != null && !typeCar.isBlank() && !typeCar.isEmpty()) {
            this.typeCar = typeCar;
        } else {
            typeCar = "Введено некорректно";
        }
    }

    public void mechanic(T transport) {
        System.out.println("Механик " + name + ", работает в компании " + company + " и обслуживает " + typeCar);
    }

    public void service() {
        System.out.println("Провожу техобслуживание");
    }

    public void fix() {
        System.out.println("Занимаюсь починкой машины");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public String getName() {
        return name;
    }
}
