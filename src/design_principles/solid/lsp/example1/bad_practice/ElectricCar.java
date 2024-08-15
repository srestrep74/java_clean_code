package design_principles.solid.lsp.example1.bad_practice;

public class ElectricCar extends Vehicle{
    private int battery;

    public ElectricCar(int battery){
        super(0); // Electric cars do not use fuel
        this.battery = battery;
    }

    @Override
    public void drive(int distance) {
        if(this.battery >= distance){
            this.battery -= distance;
            System.out.println("Electric car drove " + distance + " km");
        }else{
            System.out.println("Not enough battery to drive");
        }
    }

    @Override
    public void refuel(int amount) {
        throw new UnsupportedOperationException("Electric cars do not use fuel.");
    }

    public void recharge(int amount){
        this.battery -= amount;
        System.out.println("Electric car recharged with " + amount + " kWh");
    }

    public int getBattery(){
        return this.battery;
    }

}

/*
Here we are violating the LSP. The refuel() method that is part of the contract of Vehicle abstract class
it cannot be used in the ElectricCar class because this type of cars dont use fuel.
Instead of substitute ElectricCar by Vehicle in anywhere of the code, we obtain an exception when calling refuel() method.

For example, if we have in another class the following method :

public void serviceVehicle(Vehicle vehicle){
    vehicle.refuel(10) ; // This works for Car and Truck instances, but fails with ElectricCar instance.
}

*/
