import Userinterface.UIThread;
import Notifications.NotificationsThread;
import dataprocess.BgSYNCThread;

public class Q5 {
    public static void main(String[] args) {
        ThreadGroup myApp = new ThreadGroup("My Web App");
        Thread ui = new UIThread(myApp, "User Interface");
        Thread notifications = new NotificationsThread(myApp, "Notifications");
        Thread backgroundSync = new BgSYNCThread(myApp, "Background Sync");

        ui.start();
        notifications.start();
        backgroundSync.start();

        Thread[] appThreads = new Thread[myApp.activeCount()]; 
        System.out.println("Number of active threads in my app = " + myApp.activeCount());
        myApp.enumerate(appThreads);

        System.out.println();
        System.out.println("Name of my app: " + myApp.getName());
        System.out.println("Highest priority in my app = " + myApp.getMaxPriority());
        System.out.println();

        myApp.setMaxPriority(6);
        System.out.println("Setting highest priority in my app to 6..");
        System.out.println("Highest priority in my app = " + myApp.getMaxPriority());
        System.out.println("Daemon status of my app = " + myApp.isDaemon());
        System.out.println("Working status of my app = " + !myApp.isDestroyed());
        System.out.println();
        myApp.destroy();
        System.out.println("Destroying my app...");
        System.out.println("Working status of my app = " + !myApp.isDestroyed());
        System.out.println("Stringification of my app = " + myApp.toString());
    }
}
