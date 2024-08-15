package design_patterns.adapter.example1;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Mallard duck is quacking ...");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck is flying ...");
    }
}
