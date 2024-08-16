package design_patterns.decorator.example1.components;

// Component
public abstract class Beverage {
    String description = "Unkown Beverage";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
