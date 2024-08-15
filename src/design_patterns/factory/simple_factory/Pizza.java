package design_patterns.factory.simple_factory;

public abstract class Pizza {
    private double price;

    public Pizza(double price){
        this.price = price;
    }

    public abstract void prepare();

    public abstract void cook();
}
