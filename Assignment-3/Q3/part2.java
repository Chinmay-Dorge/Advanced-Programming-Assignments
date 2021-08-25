interface mobile{
    void makeCall();
    void checkTime();
}

interface smartPhone extends mobile{
    void playGames();
    void watchMovie();
}

class myPhone implements smartPhone{

    @java.lang.Override
    public void makeCall() {
        System.out.println("Making a call ...");
        System.out.println();
    }

    @java.lang.Override
    public void checkTime() {
        System.out.println("Checking Time ...");
        System.out.println();
    }

    @java.lang.Override
    public void playGames() {
        System.out.println("Playing games ...");
        System.out.println();
    }

    @java.lang.Override
    public void watchMovie() {
        System.out.println("Playing movie ...");
        System.out.println();
    }
}

public class part2{
    public static void main(String[] args){
        myPhone obj = new myPhone();
        obj.makeCall();
        obj.checkTime();
        obj.playGames();
        obj.watchMovie();

    }
}