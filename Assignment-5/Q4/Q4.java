public class Q4 {
    static void first(){
        second();
        System.out.println("Handled in first");
    }
    static void second(){
        third();
        System.out.println("Handled in second");
    }
    static void third(){
        fourth();
        System.out.println("Handled in third");
    }
    static void fourth() throws ArithmeticException{
        throw new ArithmeticException("Exception created in fourth");
    }

    public static void main(String[] args){
        try{
            first();
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("Handled in Main");
        }
    }
}