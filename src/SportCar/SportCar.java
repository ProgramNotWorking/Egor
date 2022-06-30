package SportCar;

import Car.Car;

public class SportCar extends Car {

    double countSeconds;
    double volume;
    int power;

    public SportCar(String brand, int year, double price,
                    boolean equipment, String countryCreator) {
        super(brand, year, price, equipment, countryCreator);
    }

    public void setCountSeconds(double countSeconds) { this.countSeconds = countSeconds; }

    public void setVolume(double volume) { this.volume = volume; }

    public void setPower(int power) { this.power = power; }

    public double getCountSeconds() { return countSeconds; }

    public double getVolume() { return volume; }

    public int getPower() { return power; }

    public void displayInfo() {

        System.out.printf("Кол-во секунд разгона: %s\nОбъем двигателя: %s\n" +
                "Мощность: %s л.с.\n", getCountSeconds(), getVolume(), getPower());

    }

}
