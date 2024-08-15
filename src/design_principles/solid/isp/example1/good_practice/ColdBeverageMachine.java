package design_principles.solid.isp.example1.good_practice;

public interface ColdBeverageMachine extends VendingMachine{
    public void dispenseWater();
    public void dispenseSoda();
}
