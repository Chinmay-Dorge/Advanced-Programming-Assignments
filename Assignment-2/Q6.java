class pentagonalNumbers{
    public void calculate(){
        for(int i=1;i<=50;i++){
            int num=(i*(3*i-1))/2;
            System.out.print(num + " ");
            if(i%5==0)
                System.out.println();
        }
    }
}
public class Q6{
    public static void main(String arg[]){
        System.out.println("First 50 pentagonal numbers are: ");
        pentagonalNumbers obj = new pentagonalNumbers();
        obj.calculate();
    }
}