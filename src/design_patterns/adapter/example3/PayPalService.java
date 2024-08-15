package design_patterns.adapter.example3;

public class PayPalService {
    public void sendPayment(int amount){
        System.out.println("Processing Paypal payment of " + amount);
    }
}
