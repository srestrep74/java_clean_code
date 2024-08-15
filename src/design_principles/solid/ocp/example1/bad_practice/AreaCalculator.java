package design_principles.solid.ocp.example1.bad_practice;

public class AreaCalculator {
    public double calculateArea(Object shape){
        double area = 0 ;
        if(shape instanceof Circle){
            Circle circle =(Circle) shape;
            area = Math.PI * circle.getRadius() * circle.getRadius();
        }else if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            area = rectangle.getWidth() * rectangle.getHeight();
        }

        return area;
    }
}

/*
If we need to add a new figure like a Triangle , we need to modify AreaCalculator method .
 */
