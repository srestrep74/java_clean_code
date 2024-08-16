package design_patterns.strategy.example1.concretes;

import design_patterns.strategy.example1.strategies.FlyBehavior;
import design_patterns.strategy.example1.strategies.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys !");
    }
}
