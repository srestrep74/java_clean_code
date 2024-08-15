package design_patterns.adapter.example3;

public class StripeAdapter implements PaymentGateway{

    private StripeService stripeService;

    public StripeAdapter(StripeService stripeService){
        this.stripeService = stripeService;
    }

    @Override
    public void processPayment(int amount) {
        this.stripeService.makePayment(amount);
    }
}
