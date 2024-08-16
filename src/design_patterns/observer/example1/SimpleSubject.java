package design_patterns.observer.example1;

import java.util.ArrayList;

public class SimpleSubject implements Subject{

    private ArrayList<Observer> observers;

    private int value = 0;

    public SimpleSubject(){
        this.observers = new ArrayList<Observer>();
    }

    public void setValue(int value) {
        this.value = value;
        this.notifyObservers();
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
            observer.update(value);
        }
    }
}
