package design_principles.solid.srp.example2;

public class Order {
    private int orderId;
    private User user;
    private Payment payment;
    private String orderStatus;

    public Order(int orderId, User user, Payment payment) {
        this.orderId = orderId;
        this.user = user;
        this.payment = payment;
        this.orderStatus = "Pending"; // Initial status
    }

    public int getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public Payment getPayment() {
        return payment;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
