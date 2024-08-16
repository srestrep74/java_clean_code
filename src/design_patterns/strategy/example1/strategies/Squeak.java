package design_patterns.strategy.example1.strategies;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeakk");
    }
}
