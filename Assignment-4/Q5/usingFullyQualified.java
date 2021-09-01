package Main;

public class usingFullyQualified {
    public static void main(String[] args){
        pack1.package1 p1 = new pack1.package1();
        pack2.package2 p2 = new pack2.package2();

        p1.getDetails();
        p2.getDetails();
    }
}