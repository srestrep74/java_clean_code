package design_patterns.decorator.example2.components;

public abstract class Pizza {
    String description = "Unkwon pizza";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
