package design_patterns.factory.simple_factory;

public class PepperoniPizza extends Pizza{

    public PepperoniPizza(double price){
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Pepperoni Pizza");
    }
}
