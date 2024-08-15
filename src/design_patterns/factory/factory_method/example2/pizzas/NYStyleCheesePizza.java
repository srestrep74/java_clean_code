package design_patterns.factory.factory_method.example2.pizzas;

public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza(double price){
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing NY's cheese pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Preparing NY's cheese pizza ...");
    }
}
