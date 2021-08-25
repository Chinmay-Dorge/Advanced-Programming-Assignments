abstract class arithmeticOperations{
    abstract public double addition(double a ,double b);
    abstract public double subtraction(double a ,double b);
    abstract public double multiplication(double a ,double b);
    abstract public double division(double a ,double b);
}
public class arithmetic extends arithmeticOperations{
    public double addition(double a , double b){
        return a+b;
    }
    public double subtraction(double a , double b){
        return a-b;
    }
    public double multiplication(double a , double b){
        return a*b;
    }
    public double division(double a , double b){
        return a/b;
    }
}