package design_patterns.decorator.example1.components;

public class Espresso extends Beverage{

    public Espresso(){
        this.description = "Espresoso Coffee";
    }

    @Override
    public double cost() {
        return 0.3;
    }
}
