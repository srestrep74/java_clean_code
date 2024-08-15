package design_patterns.factory.factory_method.example2.pizzas;

public class ChicagoStyleCheesePizza extends Pizza{

   public ChicagoStyleCheesePizza(double price){
       super(price);
   }

    @Override
    public void prepare() {
        System.out.println("Preparing Chicago's cheese pizza ...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Chicago's cheese pizza ...");
    }
}
