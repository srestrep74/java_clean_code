package design_principles.solid.isp.example1.good_practice;

public class EafitVendingMachine implements ColdBeverageMachine, SnackMachine{

    @Override
    public void dispenseWater() {
        System.out.println("Selecting water ...");
    }

    @Override
    public void dispenseSoda() {
        System.out.println("Selecting Soda ...");
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Selecting snack ...");
    }

    @Override
    public void takeMoney() {
        System.out.println("Taking money ...");
    }
}

/*
Now, there are specific interfaces with high cohession, so the client class can implement the only ones its needs.
*/
