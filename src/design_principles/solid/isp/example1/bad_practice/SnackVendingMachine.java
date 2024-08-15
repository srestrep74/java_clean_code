package design_principles.solid.isp.example1.bad_practice;

// Example of client class only for snacks
public class SnackVendingMachine implements VendingMachine{
    @Override
    public void takeMoney(int money) {
        System.out.println("Taking Money ...");
    }

    @Override
    public void brewCoffee() {

    }

    @Override
    public void brewHotChocolate() {

    }

    @Override
    public void brewTea() {

    }

    @Override
    public void dispenseWater() {

    }

    @Override
    public void dispenseSoda() {

    }

    @Override
    public void dispenseSnack() {
        System.out.println("Dispensing Snacks ...");
    }
}

/*
This class has a lot of methods it doesnt use because of the interface it implements.
*/
