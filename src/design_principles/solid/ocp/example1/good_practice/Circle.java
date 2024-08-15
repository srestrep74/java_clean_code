package design_principles.solid.ocp.example1.good_practice;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
