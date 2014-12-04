package designpatterns.observer.weather;

/**
 * Created by dwifaulus on 14-12-03.
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
