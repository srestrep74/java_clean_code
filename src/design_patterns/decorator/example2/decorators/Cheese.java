package design_patterns.decorator.example2.decorators;

import design_patterns.decorator.example2.components.Pizza;

public class Cheese extends ToppingsDecorator{

    private Pizza pizza;

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 2.45;
    }
}
