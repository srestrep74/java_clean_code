package design_patterns.factory.simple_factory.example1;

public class GreekPizza extends Pizza {

    public GreekPizza(double price){
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Greek Pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Greek Pizza");
    }
}
