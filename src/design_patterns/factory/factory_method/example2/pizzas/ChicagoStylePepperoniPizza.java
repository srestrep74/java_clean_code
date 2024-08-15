package design_patterns.factory.factory_method.example2.pizzas;

public class ChicagoStylePepperoniPizza extends Pizza{

    public ChicagoStylePepperoniPizza(double price){
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chicago's pepperoni pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Chicago's pepperoni pizza ...");
    }
}
