package designpatterns.observer.weather;

/**
 * Created by dwifaulus on 14-12-03.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
