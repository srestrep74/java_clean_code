package design_patterns.decorator.example1.decorators;

import design_patterns.decorator.example1.components.Beverage;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.5;
    }
}
