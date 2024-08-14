package design_principles.encapsulate_what_varies.example2.good_practice;

// Specific class that gives body to the interface method
public class EmailNotification implements NotificationStrategy{
    String email ;

    public EmailNotification(String email){
        this.email = email;
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending email to " + this.email + " : " + message);
    }
}
