package Car;

public class Car {

    String brand;
    int year;
    double price;
    boolean equipment;
    String countryCreator;
    String dateSale;
    String buyerName;

    public Car(String brand, int year, double price,
               boolean equipment, String countryCreator) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.equipment = equipment;
        this.countryCreator = countryCreator;
    }

    public void setDateSale(String dateSale) {

        String[] masStr = new String[3];
        masStr = dateSale.split(" ");

        if (masStr[1].equalsIgnoreCase("января")) {
            masStr[1] = "01";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else if (masStr[1].equalsIgnoreCase("февраля")) {
            masStr[1] = "02";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else if (masStr[1].equalsIgnoreCase("марта")) {
            masStr[1] = "03";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else if (masStr[1].equalsIgnoreCase("апреля")) {
            masStr[1] = "04";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else if (masStr[1].equalsIgnoreCase("майя")) {
            masStr[1] = "05";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else if (masStr[1].equalsIgnoreCase("июня")) {
            masStr[1] = "06";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else if (masStr[1].equalsIgnoreCase("июля")) {
            masStr[1] = "07";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else if (masStr[1].equalsIgnoreCase("августа")) {
            masStr[1] = "08";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else if (masStr[1].equalsIgnoreCase("сентября")) {
            masStr[1] = "09";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else if (masStr[1].equalsIgnoreCase("октября")) {
            masStr[1] = "10";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else if (masStr[1].equalsIgnoreCase("ноября")) {
            masStr[1] = "11";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else if (masStr[1].equalsIgnoreCase("декабря")) {
            masStr[1] = "12";
            this.dateSale = String.join("/" ,masStr[0], masStr[1], masStr[2]);
        } else {
            this.dateSale = "Неверный формат даты";
        }

    }

    public String getDateSale() { return this.dateSale; }

    public void setBuyerName(String buyerName) {

        String[] masStr = new String[3];
        masStr = buyerName.split(" ");

        for (int i = 0; i < 3; i++) {
            masStr[i] = String.valueOf(masStr[i].charAt(0));
        }

        this.buyerName = String.join("", masStr[0], masStr[1], masStr[2]);

    }

    public String getBuyerName() { return this.buyerName; }

    public void displayInfo() {

        System.out.printf("Марка автомобиля: %s\nГод выпуска: %s\n" +
                "Цена: %s\n", brand, year, price);
        System.out.println(equipment ? "Полная" : "Не полная");
        System.out.printf("Страна производитель: %s\nДата продажи: %s\n" +
                "ФИО покупателя: %s", countryCreator, getDateSale(), getBuyerName());

    }

}
