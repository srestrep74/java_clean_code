package design_patterns.decorator.example2.components;

public class ThickCrustPizza extends Pizza{

    public ThickCrustPizza(){
        this.description = "Thick Crust Pizza";
    }

    @Override
    public double cost() {
        return 7.85;
    }
}
