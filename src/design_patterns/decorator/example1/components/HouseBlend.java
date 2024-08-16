package design_patterns.decorator.example1.components;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "House Blend coffee";
    }

    @Override
    public double cost() {
        return 0.87;
    }
}
