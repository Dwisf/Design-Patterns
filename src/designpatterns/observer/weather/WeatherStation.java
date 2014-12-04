package designpatterns.observer.weather;

/**
 * Created by dwifaulus on 14-12-03.
 */
public class WeatherStation {
    public static void main(String[] args) {
        // weather data is the thing that can be observed
        WeatherData weatherData = new WeatherData();

        // These display objects will be the observers for the weather data.
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        // register the display objects as observers to the weather data
        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(statisticsDisplay);

        // When the weather data is changed, the observers get notified
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.3f);
    }
}
