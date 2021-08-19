class getterOnlyClass{
    int val;
    getterOnlyClass(int val){
        this.val = val;
    }
    public int getValue(){
        return this.val;
    }
}
public class Q2_getter {
    public static void main(String args[]){
        getterOnlyClass g = new getterOnlyClass(42);
        System.out.println("Value = " + g.getValue());
    }
}