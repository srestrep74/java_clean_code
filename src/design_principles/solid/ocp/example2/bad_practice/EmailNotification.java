package design_principles.solid.ocp.example2.bad_practice;

// Notification system in different ways such us email or sms.
public class EmailNotification {
    public void sendEmail(String message){
        System.out.println("Sending email : " + message);
    }

    // Then we need the sms notification, but here we are modifying this class.
    public void sendSMS(String message){
        System.out.println("Sending SMS : " + message);
    }
}

/*
Here every time we add a new form to send notification , we are modifying the class.
We need a more extensible design so that adding a new notification service, don't touch other classes implementation.
*/


