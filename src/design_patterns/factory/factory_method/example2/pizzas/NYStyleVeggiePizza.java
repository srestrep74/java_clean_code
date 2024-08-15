package design_patterns.factory.factory_method.example2.pizzas;

public class NYStyleVeggiePizza extends Pizza{

    public NYStyleVeggiePizza(double price){
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing NY's veggie pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Preparing NY's veggie pizza ...");
    }
}
