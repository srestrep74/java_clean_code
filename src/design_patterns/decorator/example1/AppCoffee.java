package design_patterns.decorator.example1;

import design_patterns.decorator.example1.components.Beverage;
import design_patterns.decorator.example1.components.DarkRoast;
import design_patterns.decorator.example1.decorators.Mocha;
import design_patterns.decorator.example1.decorators.Whip;

public class AppCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
