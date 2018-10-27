package dp_observer.impl;

import dp_observer.DisplayElement;
import dp_observer.Observer;
import dp_observer.Subject;

public class CurrentCD implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentCD(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver((Observer) this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentCD: t-> " + temperature + " h-> " + humidity);
    }


}
