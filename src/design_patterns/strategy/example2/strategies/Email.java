package design_patterns.strategy.example2.strategies;

public class Email implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("Sharingn by Email");
    }
}
