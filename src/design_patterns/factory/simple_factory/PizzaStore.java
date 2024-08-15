package design_patterns.factory.simple_factory;

public class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = SimplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.cook();

        return pizza;
    }
}
