package design_principles.encapsulate_what_varies.example1.bad_practice;

/*
Class to calculate the shipping of an order in order of its shipping type like:
- Standard
- Express
- International

Each shipping type, has a different form to calculate the shipping
*/
public class Order {

    private double weight ;

    public Order(double weight){
        this.weight = weight;
    }

    /*
    When we want to add another new type of shipping, we need to modify this method.
    This modification alternates the state of the objects and can give errors.
    */
    public double calculateShipping(String type){
        if(type.equals("standard")){
            return this.weight * 1.5 ;
        }else if(type.equals("express")){
            return this.weight * 3.0 ;
        }else if(type.equals("international")){
            return this.weight * 5.0 ;
        }

        return 0;
    }
}
