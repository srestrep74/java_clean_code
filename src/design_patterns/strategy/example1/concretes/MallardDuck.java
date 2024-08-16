package design_patterns.strategy.example1.concretes;

import design_patterns.strategy.example1.strategies.FlyWithWings;
import design_patterns.strategy.example1.strategies.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
