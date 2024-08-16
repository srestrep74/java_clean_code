package design_patterns.observer.example1;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    void setValue(int value);
}
