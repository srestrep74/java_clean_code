package design_principles.solid.lsp.example1.bad_practice;

public abstract class Vehicle {
    protected int fuel;

    public Vehicle(int fuel){
        this.fuel = fuel;
    }

    public int getFuel(){
        return this.fuel;
    }

    public abstract void drive(int distance);

    public abstract void refuel(int amount);
}
