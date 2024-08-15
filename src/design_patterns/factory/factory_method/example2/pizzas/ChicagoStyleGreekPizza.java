package design_patterns.factory.factory_method.example2.pizzas;

public class ChicagoStyleGreekPizza extends Pizza{

    public ChicagoStyleGreekPizza(double price){
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chicago's greek pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Chicago's greek pizza ...");
    }
}
