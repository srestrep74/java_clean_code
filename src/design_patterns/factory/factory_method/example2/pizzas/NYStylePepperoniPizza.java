package design_patterns.factory.factory_method.example2.pizzas;

public class NYStylePepperoniPizza extends Pizza{

    public NYStylePepperoniPizza(double price){
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing NY's pepperoni pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Preparing NY's pepperoni pizza ...");
    }
}
