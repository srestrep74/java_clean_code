package design_patterns.factory.simple_factory;

public class VeggiePizza extends Pizza{

    public VeggiePizza(double price){
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Veggie Pizza");
    }
}
