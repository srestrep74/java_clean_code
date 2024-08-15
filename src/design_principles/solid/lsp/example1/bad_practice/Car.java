package design_principles.solid.lsp.example1.bad_practice;

public class Car extends Vehicle{
    public Car(int fuel){
        super(fuel);
    }

    @Override
    public void drive(int distance) {
        if(this.fuel >= distance){
            fuel -= distance;
            System.out.println("Car drove " + distance + " km");
        }else{
            System.out.println("Not enough fuel to drive");
        }
    }

    @Override
    public void refuel(int amount) {
        this.fuel += amount;
        System.out.println("Car refueled with " + amount + " liters");
    }
}
