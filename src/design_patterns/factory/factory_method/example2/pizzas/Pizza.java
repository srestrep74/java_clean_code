package design_patterns.factory.factory_method.example2.pizzas;

public abstract class Pizza {
    private double price;

    public Pizza(double price){
        this.price = price;
    }

    public abstract void prepare();

    public abstract void cook();
}


