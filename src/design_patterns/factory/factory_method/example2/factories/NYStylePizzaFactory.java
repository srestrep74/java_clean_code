package design_patterns.factory.factory_method.example2.factories;

import design_patterns.factory.factory_method.example2.pizzas.*;

public class NYStylePizzaFactory extends PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza(15);
            case "greek" -> new NYStyleGreekPizza(20);
            case "pepperoni" -> new NYStylePepperoniPizza(20);
            case "veggie" -> new NYStyleVeggiePizza(30);
            default -> null;
        };
    }
}
