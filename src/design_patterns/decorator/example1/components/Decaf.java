package design_patterns.decorator.example1.components;

public class Decaf extends Beverage{

    public Decaf(){
        this.description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 0.65;
    }
}
