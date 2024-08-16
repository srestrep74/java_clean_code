package design_patterns.strategy.example2.strategies;

public class Txt implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("Sharing by Txt");
    }
}
