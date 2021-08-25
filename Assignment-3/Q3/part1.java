interface batteryOperatedToy{
    void checkBattery();
    void repairBattery();
}

interface remoteOperatedToys{
    void checkRemote();
    void repairRemote();
}

class toyCar implements batteryOperatedToy , remoteOperatedToys {
    toyCar(){
        System.out.println("Toy car has been created");
    }

    @java.lang.Override
    public void checkBattery() {
        System.out.println("Checking battery...");
        System.out.println();
    }

    @java.lang.Override
    public void repairBattery(){
        System.out.println("Repairing battery...");
        System.out.println("...Successfully repaired");
        System.out.println();
    }

    @java.lang.Override
    public void checkRemote(){
        System.out.println("Checking remote...");
        System.out.println();
    }

    @java.lang.Override
    public void repairRemote() {
        System.out.println("Repairing remote...");
        System.out.println("...Successfully repaired");
        System.out.println();
    }
}

public class part1 {
    public static void main(String[] args){
        toyCar obj = new toyCar();
        obj.checkBattery();
        obj.repairBattery();
        obj.checkRemote();
        obj.repairRemote();
    }
}