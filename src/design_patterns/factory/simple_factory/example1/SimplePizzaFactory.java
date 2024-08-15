package design_patterns.factory.simple_factory.example1;

public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza(10);
            case "greek" -> new GreekPizza(5);
            case "pepperoni" -> new PepperoniPizza(8.5);
            case "veggie" -> new VeggiePizza(10);
            default -> null;
        };

        return pizza;
    }
}
