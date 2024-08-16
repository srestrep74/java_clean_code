package design_patterns.decorator.example1.decorators;

import design_patterns.decorator.example1.components.Beverage;

public class Whip extends CondimentDecorator {

    private Beverage beverage ; //Composition

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.10;
    }
}
