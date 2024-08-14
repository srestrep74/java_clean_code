package design_principles.encapsulate_what_varies.example1.good_practice;

// Specific class that gives body to the interface method
public class StandardShipping implements ShippingStrategy{
    @Override
    public double calculateShipping(double weight) {
        return weight * 1.5 ;
    }
}
