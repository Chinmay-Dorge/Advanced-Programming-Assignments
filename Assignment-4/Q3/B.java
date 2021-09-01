package pack;

public class B {
    private String TrainName;

    public void setTrainName(String s){
        this.TrainName=s;
    }
    public String getTrainName(){
        return TrainName;
    }
    private int cost;
    protected void SetCost(int i) {
        this.cost = i;

    }

    public int getCost() {
        return cost;
    }

}