package Special;

import Car.Car;

public class Special extends Car {

    String type;
    double weight;
    double size;

    public Special(String brand, int year, double price,
                   boolean equipment, String countryCreator) {
        super(brand, year, price, equipment, countryCreator);
    }

    public void setType(String type) { this.type = type; }

    public void setWeight(double weight) { this.weight = weight; }

    public void setSize(double size) { this.size = size; }

    public String getType() { return type; }

    public double getWeight() { return weight; }

    public double getSize() { return size; }

    public void displayInfo() {

        System.out.printf("Вид: %s\nМасса: %s\nГабаритные размеры: %s",
                getType(), getWeight(), getSize());

    }

}
