package design_patterns.decorator.example1.decorators;

import design_patterns.decorator.example1.components.Beverage;

// Decorator
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
