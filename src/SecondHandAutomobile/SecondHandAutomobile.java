package SecondHandAutomobile;

import Car.Car;

public class SecondHandAutomobile extends Car {

    boolean degreeOfPreservation;
    String holderName;
    int mileage;

    public SecondHandAutomobile(String brand, int year, double price,
                                boolean equipment, String countryCreator) {
        super(brand, year, price, equipment, countryCreator);
    }

    public void setHolderName(String holderName) {
        this.holderName = getCorrectName(holderName);
    }

    public String getHolderName() { return this.holderName; }

    public void setDegreeOfPreservation(boolean b) {}

    public boolean isDegreeOfPreservation() { return this.degreeOfPreservation; }

    public void setMileage(int mileage) { this.mileage = mileage; }

    public int getMileage() { return this.mileage; }

    public void displayInfo() {

        System.out.println(isDegreeOfPreservation() ? "Хорошая степень сохранности" :
                "Плохая степень сохранности");
        System.out.printf("ФИО владельца: %s\nПробег: %s\n", getHolderName(), getMileage());

    }

}
