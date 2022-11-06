package transport;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected double sizeEngine;
    protected boolean diagnostic;

    public boolean isDiagnostic() {
        return diagnostic;
    }

    public Transport(String brand, String model, double sizeEngine) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (sizeEngine != 0) {
            this.sizeEngine = sizeEngine;
        } else {
            this.sizeEngine = 3;
        }
    }

    public void printType() {
        System.out.println("Тип - ");
    }

    public abstract boolean diagnostics();



    public void go() {
        System.out.println("Начать");
    }

    public void finish() {
        System.out.println("Закончить");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getSizeEngine() {
        return sizeEngine;
    }

    public void setSizeEngine(double sizeEngine) {
        if (sizeEngine == 0) {
            this.sizeEngine = 1.5;
        } else {
            this.sizeEngine = sizeEngine;
        }
    }
}



