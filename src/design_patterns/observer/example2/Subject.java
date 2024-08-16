package design_patterns.observer.example2;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    public void setTemperature(double temperature);
    public void setWindSpeed(double windSpeed);
    public void setPressure(double pressure);
}
