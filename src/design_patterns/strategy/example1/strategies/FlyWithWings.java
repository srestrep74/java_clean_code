package design_patterns.strategy.example1.strategies;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flyingg ...");
    }
}
