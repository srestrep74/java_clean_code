package design_patterns.factory.factory_method.example2.factories;

import design_patterns.factory.factory_method.example2.pizzas.*;

public class ChicagoStylePizzaFactory extends PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza(15);
            case "greek" -> new ChicagoStyleGreekPizza(20);
            case "pepperoni" -> new ChicagoStylePepperoniPizza(20);
            case "veggie" -> new ChicagoStyleVeggiePizza(30);
            default -> null;
        };
    }
}
