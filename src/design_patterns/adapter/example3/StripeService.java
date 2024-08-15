package design_patterns.adapter.example3;

public class StripeService {
    public void makePayment(int amount){
        System.out.println("Processing Stripe payment of : " + amount);
    }
}
