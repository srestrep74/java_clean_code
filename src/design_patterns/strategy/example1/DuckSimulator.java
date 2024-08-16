package design_patterns.strategy.example1;

import design_patterns.strategy.example1.concretes.Duck;
import design_patterns.strategy.example1.concretes.MallardDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
