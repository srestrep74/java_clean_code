package design_principles.solid.lsp.example1.bad_practice;

public class Truck extends Vehicle{
    public Truck(int fuel){
        super(fuel);
    }

    @Override
    public void drive(int distance) {
        if(this.fuel >= distance*2) { // Truck consumes more fuel
            this.fuel -= distance*2;
            System.out.println("Truck drove " + distance + " km");
        }else{
            System.out.println("Not enough fuel to drive");
        }
    }

    @Override
    public void refuel(int amount) {
        fuel += amount;
        System.out.println("Truck refueled with " + amount + " liters.");
    }


}
