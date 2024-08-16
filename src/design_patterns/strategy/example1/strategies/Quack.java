package design_patterns.strategy.example1.strategies;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quackk");
    }
}
