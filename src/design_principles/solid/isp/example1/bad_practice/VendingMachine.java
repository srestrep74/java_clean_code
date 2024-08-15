package design_principles.solid.isp.example1.bad_practice;

// Abstraction of a vending machine
public interface VendingMachine {
    public void takeMoney(int money); // Ecommerce

    // Then the company wants to add hot products
    public void brewCoffee();
    public void brewHotChocolate();
    public void brewTea();

    // Then , they add cold drinks
    public void dispenseWater();
    public void dispenseSoda();

    // Finally, the add the snacks functionality
    public void dispenseSnack();

}

/*
This interface is low cohesive, so each client class implements it, has to implement innecessary method it wont use
This gives a lot of dependency of methods.
*/
