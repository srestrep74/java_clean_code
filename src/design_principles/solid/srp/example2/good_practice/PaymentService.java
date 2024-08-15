package design_principles.solid.srp.example2.good_practice;

import design_principles.solid.srp.example2.Payment;

public class PaymentService {
    public void validatePayment(Payment payment){
        System.out.println("Payment of " + payment.getAmount() + " using " + payment.getMethod() + " validated.");
    }
}
