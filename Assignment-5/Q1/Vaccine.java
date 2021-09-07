package citizen;
import citizen.Citizen;
public class Vaccine extends Citizen{
    public Vaccine(String name , String aadharNo , String phoneNo , int age){
        super(name,aadharNo,phoneNo,age);
    }

    public void verifyAge() throws Exception {
        if(age < 18){
            throw new Exception("Cannot be vaccinated. Age should be above 18");
        }
        else{
            System.out.println(name + " can be vaccinated");
        }
    }
}