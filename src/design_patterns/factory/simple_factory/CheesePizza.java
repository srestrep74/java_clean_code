package design_patterns.factory.simple_factory;

public class CheesePizza extends Pizza{

    public CheesePizza(double price){
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Cheese Pizza");
    }
}
