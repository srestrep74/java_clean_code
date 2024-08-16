package design_patterns.observer.example2;

public class UserInterface implements Observer{

    private double temperature, windSpeed, pressure;
    private Subject subject;

    public UserInterface(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(double temperature, double windSpeed, double pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.display();
    }

    public void display(){
        System.out.println("Temperature : " + this.temperature + ", windSpeed : " + this.windSpeed + " , pressure : " + this.pressure);
    }
}
