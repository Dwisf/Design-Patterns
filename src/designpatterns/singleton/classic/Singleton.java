package designpatterns.singleton.classic;

// This is a classic singleton, but it is not thread-safe

/**
 * Created by dwifaulus on 14-12-03.
 */
public class Singleton {
    private static Singleton INSTANCE;

    // Constructor is set to be private so this class cannot be externally instantiated.
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public String getDescription() {
        return "I'm a classic singleton but I am not thread-safe";
    }
}
