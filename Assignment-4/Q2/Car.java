package car;
import vehicle.*;
public class Car extends Vehicle{
    public Car(String company, String fuelType){
        super(company,fuelType,4);
        }

        public void displayProperties(){
        System.out.println("Properties of this car: ");
        super.displayProperties();
        }
}