package designpatterns.observer.weather;

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
    public void update(float temp, float humidity, float pressure) {
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
