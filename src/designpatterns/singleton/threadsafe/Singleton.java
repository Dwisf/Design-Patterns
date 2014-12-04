package designpatterns.singleton.threadsafe;

/**
 * Created by dwifaulus on 14-12-03.
 */
public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public String getDescription() {
        return "I'm a thread safe Singleton!!";
    }
}
