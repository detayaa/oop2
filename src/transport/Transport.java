package transport;
    public abstract class Transport {
        String brand;
         String model;
         int date;
         String country;
         String color;
         int maxSpeed;

        public Transport(String brand, String model, int date, String country, String color) {
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

            if (date == 0) {
                this.date = 2000;
            } else {
                this.date = date;
            }

            this.setColor(color);

            if (country == null || country.isEmpty()) {
                this.country = "default";
            } else {
                this.country = country;
            }
        }
        public Transport(String brand, String model, int date, String country, int maxSpeed) {
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

            if (date == 0) {
                this.date = 2000;
            } else {
                this.date = date;
            }

            this.setColor(color);

            if (country == null || country.isEmpty()) {
                this.country = "default";
            } else {
                this.country = country;
            }
            if (maxSpeed != 0) {
                this.maxSpeed = maxSpeed;
            } else { this.maxSpeed = 100;}



        }
        public Transport(String brand, String model, int date, String country, String color,int maxSpeed) {
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

            if (date == 0) {
                this.date = 2000;
            } else {
                this.date = date;
            }

            this.setColor(color);

            if (country == null || country.isEmpty()) {
                this.country = "default";
            } else {
                this.country = country;
            }
            if (maxSpeed != 0) {
                this.maxSpeed = maxSpeed;
            } else { this.maxSpeed = 100;}
        }

        public abstract void refil();




        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            if (color == null || color.isEmpty() || color.isBlank()) {
                this.color = "белый";
            } else {
                this.color = color;
            }

        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            if (maxSpeed != 0) {
                this.maxSpeed = maxSpeed;
            } else this.maxSpeed = 60;}



        public int getYear() {
            return date;
        }

        public String getCountry() {
            return country;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }
    }



