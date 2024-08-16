package design_patterns.strategy.example2.strategies;

public class Social implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("Sharing by Social Media");
    }
}
