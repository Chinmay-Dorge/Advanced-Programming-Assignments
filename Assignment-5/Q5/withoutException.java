public class withoutException {
    public static void main(String[] args) throws ArithmeticException{
        try {
            System.out.println("Try Block");
            int a = 50 / 10;
        }catch (Exception e){
            throw new ArithmeticException("Cannot divide by 0");
        }finally {
            System.out.println("Finally statement");
        }
        System.out.println("Rest of code");
    }
}