package design_patterns.decorator.example2.decorators;

import design_patterns.decorator.example2.components.Pizza;

public class Peppers extends ToppingsDecorator{

    private Pizza pizza;

    public Peppers(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Peppers";
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 2.00;
    }
}
