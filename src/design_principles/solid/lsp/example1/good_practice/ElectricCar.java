package design_principles.solid.lsp.example1.good_practice;

public class ElectricCar extends Vehicle implements ElectricPowered{
    private int battery;

    public ElectricCar(int battery){
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
    public void recharge(int amount) {
        this.battery += amount;
        System.out.println("Electric car recharged with " + amount + " kWh");
    }
}

/*
By this way, substituting ElectricCar by Vehicle is possible cause Vehicle only has one method in his contract, and ElectricCar class implemented it.
The different methods are not given by the inheritance relationship, are given by the interface ElectricPowered implementation.
*/
