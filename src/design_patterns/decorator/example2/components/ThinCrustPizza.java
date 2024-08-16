package design_patterns.decorator.example2.components;

public class ThinCrustPizza extends Pizza{

    public ThinCrustPizza(){
        this.description = "Thin Crust Pizza";
    }

    @Override
    public double cost() {
        return 4.99;
    }
}
