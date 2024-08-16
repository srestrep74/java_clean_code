package design_patterns.strategy.example1.strategies;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly :((((");
    }
}
