package design_patterns.factory.factory_method.example2.pizzas;

public class NYStyleGreekPizza extends Pizza{

    public NYStyleGreekPizza(double price){
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing NY's greek pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Preparing NY's greek pizza ...");
    }
}
