package transport;
public class Train extends Transport {
    int price;
    int time;
    String startStation;
    String finishStation;
    int countCarriage;


    public Train(String brand, String model, int date, String country, int maxSpeed, String startStation, String finishStation, int price, int countCarriage ) {
        super(brand,model,date,country,maxSpeed);
        if (startStation != null && !startStation.isBlank() && !startStation.isEmpty()) {
            this.startStation = startStation;
        } else {
            System.out.println("Информация неккоректна");
        }
        if (finishStation != null && !finishStation.isBlank() && !finishStation.isEmpty()) {
            this.finishStation = finishStation;
        } else {
            System.out.println("Информация неккоректна");
        }
        if (price != 0) {
            this.price = price;
        } else { this.price = 100;}
        if (countCarriage != 0) {
            this.countCarriage = countCarriage;
        } else { this.price = 10;}
    }

    public void informationTrain() {
        System.out.println("Поезд - " + brand + ", модель " + model + ", " + date + " год выпуска в " + country + ", скорость передвижения - " + maxSpeed + " км/ч, отходит от " + startStation + " и следует до станции " + finishStation + ". Цена поездки - " + price + ", в поезде " + countCarriage + " вагонов");

    }







    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        this.finishStation = finishStation;
    }

    public int getCountCarriage() {
        return countCarriage;
    }

    public void setCountCarriage(int countCarriage) {
        this.countCarriage = countCarriage;
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }
}
