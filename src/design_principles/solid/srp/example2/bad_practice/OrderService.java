package design_principles.solid.srp.example2.bad_practice;

import design_principles.solid.srp.example2.Order;
import design_principles.solid.srp.example2.Payment;
import design_principles.solid.srp.example2.User;

/*
Class that creates orders, validate payments, and notify users.
*/
public class OrderService {
    public void createOrder(Order order){
        order.setOrderStatus("Created");
        System.out.println("Order " + order.getOrderId() + " created for user: " + order.getUser().getName());
    }

    public void validatePayment(Payment payment){
        System.out.println("Payment of " + payment.getAmount() + " using " + payment.getMethod() + " validated.");
    }

    public void notifyUser(User user){
        System.out.println("Notification sent to user: " + user.getEmail());
    }
}

/*
This class has a lot of respon.
*/

/*
Main Example :
 public static void main(String[] args) {
        User user = new User("Alice", "alice@example.com");
        Payment payment = new Payment(100.0, "Credit Card");
        Order order = new Order(1, user, payment);

        OrderService orderService = new OrderService();
        orderService.createOrder(order);
        orderService.validatePayment(payment);
        orderService.notifyUser(user);
    }
*/