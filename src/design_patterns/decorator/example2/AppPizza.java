package design_patterns.decorator.example2;

import design_patterns.decorator.example2.components.Pizza;
import design_patterns.decorator.example2.components.ThickCrustPizza;
import design_patterns.decorator.example2.decorators.Cheese;
import design_patterns.decorator.example2.decorators.Peppers;

public class AppPizza {
    public static void main(String[] args) {
        Pizza pizza = new ThickCrustPizza();
        pizza = new Cheese(pizza);
        pizza = new Peppers(pizza);

        System.out.println(pizza.getDescription() + " $" + pizza.cost());
    }
}
