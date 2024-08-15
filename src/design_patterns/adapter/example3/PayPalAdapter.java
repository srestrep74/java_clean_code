package design_patterns.adapter.example3;

public class PayPalAdapter implements PaymentGateway{

    private PayPalService payPalService;

    public PayPalAdapter(PayPalService payPalService){
        this.payPalService = payPalService;
    }

    @Override
    public void processPayment(int amount) {
        this.payPalService.sendPayment(amount);
    }
}
