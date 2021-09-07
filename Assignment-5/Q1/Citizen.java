package citizen;
public abstract class Citizen {
    protected String name, aadharNo, phoneNo;
    protected int age;

    public Citizen(String name , String aadharNo , String phoneNo , int age){
            this.name = name;
            this.aadharNo = aadharNo;
            this.phoneNo = phoneNo;
            this.age = age;
    }

    public abstract void verifyAge() throws Exception;
}