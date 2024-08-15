package design_principles.solid.ocp.example2.good_practice;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending email : " + message);
    }
}
