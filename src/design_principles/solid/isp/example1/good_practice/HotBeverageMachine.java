package design_principles.solid.isp.example1.good_practice;

public interface HotBeverageMachine extends VendingMachine {
    public void brewCoffee();
    public void brewHotChocolate();
    public void brewTea();
}
