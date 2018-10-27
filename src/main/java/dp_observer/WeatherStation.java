package dp_observer;

import dp_observer.impl.CurrentCD;
import dp_observer.impl.WeatherData;

public class WeatherStation {

    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();

        CurrentCD currentCD = new CurrentCD(weatherData);

        weatherData.setMeasurements(10,15,12);


    }

}
