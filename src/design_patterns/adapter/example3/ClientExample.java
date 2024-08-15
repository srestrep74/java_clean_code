package design_patterns.adapter.example3;

public class ClientExample {
    public static void main(String [] args){
        PaymentGateway payPalAdapter = new PayPalAdapter(new PayPalService());
        PaymentProcessor payment = new PaymentProcessor(payPalAdapter);

        payment.process(1000);
    }
}
