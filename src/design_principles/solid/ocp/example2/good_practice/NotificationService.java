package design_principles.solid.ocp.example2.good_practice;

public class NotificationService {
    public void sendNotification(Notification notification, String message){
        notification.send(message);
    }
}

/*
Here , if we need a new way to send notifications, we create a new class that implements Notification interface.
This allow the code be more extensible and do not touch other classes according to OCP .
*/
