import design_patterns.factory.factory_method.example2.factories.ChicagoStylePizzaFactory;
import design_patterns.factory.factory_method.example2.factories.NYStylePizzaFactory;
import design_patterns.factory.factory_method.example2.factories.PizzaFactory;
import design_patterns.factory.factory_method.example2.pizzas.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaFactory store1 = new NYStylePizzaFactory();

        Pizza pizza1 = store1.orderPizza("cheese");

        PizzaFactory store2 = new ChicagoStylePizzaFactory();

        Pizza pizza2 = store2.orderPizza("greek");
    }
}