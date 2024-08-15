package design_principles.solid.srp.example2.good_practice;

import design_principles.solid.srp.example2.Order;

public class OrderService {
    private final PaymentService paymentService;
    private final NotificationService notificationService;

    public OrderService(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    public void createOrder(Order order){
        paymentService.validatePayment(order.getPayment());
        notificationService.notifyUser(order.getUser());
    }
}
