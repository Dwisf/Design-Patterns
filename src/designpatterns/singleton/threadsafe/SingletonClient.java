package designpatterns.singleton.threadsafe;

/**
 * Created by dwifaulus on 14-12-03.
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
