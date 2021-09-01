package A;
//use of interface
interface Date{
    void setDate(String i);
}

public class Travel implements Date{
    String date;
    String destination;
    public void setDate(String i){
        this.date=i;
    }
    public String getDate() {
        return date;
    }

    public void setDestination(String s){
        this.destination=s;
    }
    public String getDestination() {
        return destination;
    }

}