package designpatterns.observer.weatherObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dwifaulus on 14-12-03.
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float tempSum = 0.0f;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float numReadings;


    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
            display();

        }

    }
}
