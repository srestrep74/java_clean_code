package design_patterns.observer.example2;

import java.util.ArrayList;

public class WeatherStation implements Subject{

    private ArrayList<Observer> observers;

    private double temperature, windSpeed, pressure;

    public WeatherStation(){
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : this.observers){
            observer.update(this.temperature, this.windSpeed, this.pressure);
        }
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }

    @Override
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
        this.notifyObservers();
    }

    @Override
    public void setPressure(double pressure) {
        this.pressure = pressure;
        this.notifyObservers();
    }
}
