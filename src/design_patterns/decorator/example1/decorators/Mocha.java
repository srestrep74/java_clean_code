package design_patterns.decorator.example1.decorators;

import design_patterns.decorator.example1.components.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.12;
    }
}
