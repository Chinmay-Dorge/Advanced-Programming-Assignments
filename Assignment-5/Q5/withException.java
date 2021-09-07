public class withException {
    public static void main(String[] args) throws ArithmeticException{
        try {
            System.out.println("Try block");
            int a = 50 / 0;
        }catch (Exception e){
            throw new ArithmeticException("Cannot divide by 0");
        }finally {
            System.out.println("Finally statement");
        }
        System.out.println("Rest of code");
    }
}