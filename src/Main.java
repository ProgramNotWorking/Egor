import Car.Car;
import SecondHandAutomobile.SecondHandAutomobile;
import Special.Special;
import SportCar.SportCar;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Митсубиси", 2007, 108000.0,
                false, "Япония");
        car.setDateSale("10 января 2020");
        car.setBuyerName("Иванов Иван Иванович");
        car.displayInfo();

        SecondHandAutomobile secondHandAutomobile = new SecondHandAutomobile("Митсубиси", 2007, 108000.0,
                false, "Япония");
        secondHandAutomobile.setHolderName("Бухонов Денис Алексеевич");
        secondHandAutomobile.setMileage(200500);
        secondHandAutomobile.setDegreeOfPreservation(true);
        secondHandAutomobile.displayInfo();

        SportCar sportCar = new SportCar("Митсубиси", 2007, 108000.0,
                false, "Япония");
        sportCar.setCountSeconds(5);
        sportCar.setVolume(2.4);
        sportCar.setPower(70);
        sportCar.displayInfo();

        Special special = new Special("Митсубиси", 2007, 108000.0,
                false, "Япония");
        special.setType("Грузовик");
        special.setWeight(2120.5);
        special.setSize(100);
        special.displayInfo();

    }
}