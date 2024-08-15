package design_principles.solid.dip.example1.good_practice;

public class Television implements OnOffDevice{
    @Override
    public void turnOn() {
        System.out.println("Turning on TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off TV");
    }
}
