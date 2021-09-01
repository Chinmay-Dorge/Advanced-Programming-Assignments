package Main;
import pack1.package1;
import pack2.package2;

public class usingClassname{
    public static void main(String[] args){
        package1 p1 = new package1();
        package2 p2 = new package2();

        p1.getDetails();
        p2.getDetails();
    }

}