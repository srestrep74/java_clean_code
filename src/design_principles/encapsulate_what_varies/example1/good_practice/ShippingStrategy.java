package design_principles.encapsulate_what_varies.example1.good_practice;


// Abstraction that defines a method to calculate the shipping
public interface ShippingStrategy {
    double calculateShipping(double weight);
}
