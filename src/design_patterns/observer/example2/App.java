package design_patterns.observer.example2;

public class App {
    public static void main(String[] args) {
        Subject subject = new WeatherStation();

        Observer ob1 = new UserInterface(subject);
        Observer ob2 = new UserInterface(subject);
        Observer ob3 = new UserInterface(subject);

        subject.notifyObservers();

        System.out.println();

        subject.setTemperature(32);
    }
}
