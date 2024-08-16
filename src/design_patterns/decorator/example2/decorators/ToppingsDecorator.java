package design_patterns.decorator.example2.decorators;

import design_patterns.decorator.example2.components.Pizza;

public abstract class ToppingsDecorator extends Pizza {
    public abstract String getDescription();
}
