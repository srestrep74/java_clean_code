package design_patterns.decorator.example2.decorators;

import design_patterns.decorator.example2.components.Pizza;

public class Olives extends ToppingsDecorator{

    private Pizza pizza;

    public Olives(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Olives";
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 1.20;
    }
}
