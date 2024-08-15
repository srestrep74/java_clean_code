package design_principles.solid.ocp.example1.good_practice;

public class AreaCalculator {
    public double calculateArea(Shape shape){
        return shape.calculateArea();
    }
}
/*
By this way, if we need a new figure, we just create a new class that implements Shape interface, without modifying AreaCalculator class.
*/
