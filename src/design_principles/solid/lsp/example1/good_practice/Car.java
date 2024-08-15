package design_principles.solid.lsp.example1.good_practice;

public class Car extends Vehicle implements FuelPowered{
    private int fuel ;

    public Car(int fuel){
        this.fuel = fuel;
    }

    @Override
    public void drive(int distance) {
        if(this.fuel >= distance){
            this.fuel -= distance;
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
