package design_patterns.observer.example1;

public class App {
    public static void main(String[] args) {
        Subject subject = new SimpleSubject();

        Observer ob1 = new SimpleObserver(subject);
        Observer ob2 = new SimpleObserver(subject);
        Observer ob3 = new SimpleObserver(subject);

        subject.notifyObservers();

        System.out.println();

        subject.setValue(10);

    }
}
