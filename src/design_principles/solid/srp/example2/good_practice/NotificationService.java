package design_principles.solid.srp.example2.good_practice;

import design_principles.solid.srp.example2.User;

public class NotificationService {
    public void notifyUser(User user){
        System.out.println("Notification sent to user: " + user.getEmail());
    }
}
