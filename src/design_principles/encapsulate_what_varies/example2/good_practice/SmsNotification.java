package design_principles.encapsulate_what_varies.example2.good_practice;

// Specific class that gives body to the interface method
public class SmsNotification implements NotificationStrategy{
    String phone;

    public SmsNotification(String phone){
        this.phone = phone;
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS to " + this.phone + " : " + message);
    }
}
