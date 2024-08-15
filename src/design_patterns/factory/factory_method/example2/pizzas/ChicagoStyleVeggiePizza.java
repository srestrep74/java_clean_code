package design_patterns.factory.factory_method.example2.pizzas;

public class ChicagoStyleVeggiePizza extends Pizza{

    public ChicagoStyleVeggiePizza(double price){
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chicago's veggie pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Chicago's veggie pizza ...");
    }
}
