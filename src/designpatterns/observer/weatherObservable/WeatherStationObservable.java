package designpatterns.observer.weatherObservable;

// Utilize Using java.util.observable and observer classes

/**
 * Created by dwifaulus on 14-12-03.
 */
public class WeatherStationObservable {
    public static void main(String[] args) {
        // weather data is the thing that can be observed
        WeatherData weatherData = new WeatherData();

        // These display objects will be the observers for the weather data.
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        // register the display objects as observers to the weather data
        weatherData.addObserver(currentDisplay);
        weatherData.addObserver(forecastDisplay);
        weatherData.addObserver(statisticsDisplay);

        // When the weather data is changed, the observers get notified
        weatherData.setMeasurements(90, 65, 30.4f);
        weatherData.setMeasurements(92, 70, 29.2f);
        weatherData.setMeasurements(98, 90, 29.3f);
    }
}
