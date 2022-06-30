import Car.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Митсубиси", 2007, 108000.0,
                false, "Япония");
        car.setDateSale("10 января 2020");
        car.setBuyerName("Иванов Иван Иванович");
        car.displayInfo();

    }
}