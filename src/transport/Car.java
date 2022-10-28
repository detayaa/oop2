package transport;
import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;


public class Car extends Transport {

    private double sizeEngine;
    private String transmission;
    private final String typeBody;
    private String number;
    private final int countSeats;
    private String tire;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, int date, String country, String color, double sizeEngine, String transmission, String typeBody, String number, int countSeats, String tire) {
        super(brand,model,date,country,color);

        this.setSizeEngine(sizeEngine);

        this.setNumber(number);

        if (LocalDate.now().getMonth() == Month.JUNE || LocalDate.now().getMonth() == Month.JULY || LocalDate.now().getMonth() == Month.AUGUST) {
            if (Objects.equals(tire, "зимняя")) {
                this.tire = "смените шины на сезонные";
            } else if (LocalDate.now().getMonth() == Month.JANUARY || LocalDate.now().getMonth() == Month.DECEMBER || LocalDate.now().getMonth() == Month.FEBRUARY) {
                if (Objects.equals(tire, "летняя")) {
                    this.tire = "смените шины на сезонные";
                }
            }
        } else {
            this.tire = "приготовьтесь менять шины";
        }

        if (typeBody != null && !typeBody.isEmpty() && !typeBody.isBlank()) {
            this.typeBody = typeBody;
        } else {
            this.typeBody = "Не указано";
        }

        this.setTransmission(transmission);
        if (countSeats > 0) {
            this.countSeats = countSeats;
        } else {
            this.countSeats = 4;
        }

    }

    @Override
    public void refil() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }

    public static class Key {
        private final String remoteStart;
        private final String keylessAccess;

        public String getRemoteStart() {
            return remoteStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        public Key(String remoteStart, String keylessAccess) {
            if (remoteStart != null && !remoteStart.isEmpty() && !remoteStart.isBlank()) {
                this.remoteStart = remoteStart;
            } else {
                this.remoteStart = "Данные не указаны";
            }

            if (keylessAccess != null && !keylessAccess.isEmpty() && !keylessAccess.isBlank()) {
                this.keylessAccess = keylessAccess;
            } else {
                this.keylessAccess = "Данные не указаны";
            }
        }
    }

    public static class Insurance {
        private int validity;
        private int price;
        private int number;

        public int getValidity() {
            return validity;
        }

        public int getPrice() {
            return price;
        }

        public int getNumber() {
            return number;
        }


        public Insurance(int validity, int price, int number) {
            if (validity != 0) {
                if ((LocalDate.now().getYear() - validity) >= 1) {
                    System.out.println("Страховка просрочена");
                }
            } else {
                System.out.println("Информация неккоректна");
            }

            if (price != 0) {
                this.price = price;
            } else {
                System.out.println("Информация неккоректна");
            }

            if (number != 0 ) {
                this.number = number;
            } else {
                System.out.println("Информация неккоректна");
            }

            if (number % 1000000000 != number) {
                System.out.println("Номер страховки некорректный");
            }
        }
    }




    public void information() {
        System.out.println(brand + " " + model + ", " + date + " год выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя - " + sizeEngine + " л. Коробка передач - " + transmission + ", тип кузова - " + typeBody + ", номер " + number + ". Шины - " + tire);

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


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "По умолчанию";
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (Objects.equals(number, "х000хх000")) {
            this.number = number;
        } else {
            this.number = "Информация некорректна";
        }

    }

    public int getDate() {
        return date;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public String getTire() {
        return tire;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance() {
        if (insurance != null) {
            this.insurance = insurance;
        }

    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
