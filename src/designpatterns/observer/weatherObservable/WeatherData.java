package designpatterns.observer.weatherObservable;

import java.util.Observable;

/**
 * Created by dwifaulus on 14-12-03.
 */
public class WeatherData extends Observable {
    private float humidity;
    private float temperature;
    private float pressure;


    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();  // Important!!
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }
}
