package design_patterns.adapter.example3;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void process(int amount){
        this.paymentGateway.processPayment(amount);
    }
}
