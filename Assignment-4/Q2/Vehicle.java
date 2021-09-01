package vehicle;
public class Vehicle {
    protected int wheels;
    protected String company, fuelType;

    protected Vehicle(String company, String fuelType, int wheels) {
        this.company = company;
        this.fuelType = fuelType;
        this.wheels = wheels;
    }

    protected void displayProperties() {
        System.out.println("-------------------------------");
        System.out.println("Company: " + company);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Number of wheels: " + wheels);
        System.out.println("-------------------------------");
    }
}