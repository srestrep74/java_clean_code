package design_principles.solid.srp.example2;

public class Payment {
    private double amount;
    private String method; // e.g., "Credit Card", "PayPal", etc.

    public Payment(double amount, String method) {
        this.amount = amount;
        this.method = method;
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }
}
