package design_principles.encapsulate_what_varies.example1.good_practice;

public class Order {
    private double weight ;
    private ShippingStrategy strategy;

    public Order(double weight, ShippingStrategy strategy) {
        this.weight = weight;
        this.strategy = strategy ; // Aggregation
    }

    public double calculateShipping(){
        return this.strategy.calculateShipping(this.weight);
    }
}

/*
Here the method calculateShipping() is the part of the system that could change in time
adding new methods of shipping.

If this calculus were directly in Order Class, every time we need a new strategy for shipping,
we would modify the class Order doing the class difficult to be maintained.

To not implement all the possible strategies of shipping directly in Order class,
this method is isolated (encapsulated) in the interface ShippingStrategy, and its concrete implementations
as StandardShipping class, ExpressShipping class, etc ; are given.

This allows us to add new strategy methods without changing current code, making this more
flexible, maintainable and reusable that are the characteristics of design principles.

Main Example :

import design_principles.encapsulate_what_varies.example1.good_practice.ExpressShipping;
import design_principles.encapsulate_what_varies.example1.good_practice.Order;
import design_principles.encapsulate_what_varies.example1.good_practice.ShippingStrategy;

public class Main {
    public static void main(String[] args) {

        ShippingStrategy strategy = new ExpressShipping();
        double weight  = 4.0;

        Order order = new Order(weight, strategy);

        double answer = order.calculateShipping();

        System.out.println(answer);
    }
}

**/
