public class Football extends Sport{
    @java.lang.Override
    public void play() {
        System.out.println("Playing Football");
    }

    public void play(int a , int b){
        System.out.println("Playing football with score " + a + " - " + b );
    }
}