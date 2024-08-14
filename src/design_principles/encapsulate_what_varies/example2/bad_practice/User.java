package design_principles.encapsulate_what_varies.example2.bad_practice;

/*
The system needs to notify a user when some actions are done.
For example, when a new order is created. Initially, we only have email or SMS notifications.
 */
public class User {
    private String email;
    private String phone;

    /*
    When the system allows another notification mechanism, we have to change the code of this method.
    */
    public void notifyUser(String message, String method){
        if(method.equals("email")){
            this.sendEmail(message);
        }else if(method.equals("sms")){
            this.sendSms(message);
        }
    }

    private void sendEmail(String message){
        System.out.println("Sending email to " + this.email + " : " + message);
    }

    private void sendSms(String message){
        System.out.println("Sending SMS to " + this.phone + " : " + message);
    }
}
