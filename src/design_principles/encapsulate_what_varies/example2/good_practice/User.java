package design_principles.encapsulate_what_varies.example2.good_practice;

public class User {
    private NotificationStrategy strategy ;

    public User(NotificationStrategy strategy){
        this.strategy = strategy ;
    }

    public void notifyUser(String message){
        this.strategy.notifyUser(message);
    }
}

/*
Main Example :
import design_principles.encapsulate_what_varies.example2.good_practice.NotificationStrategy;
import design_principles.encapsulate_what_varies.example2.good_practice.SmsNotification;
import design_principles.encapsulate_what_varies.example2.good_practice.User;

public class Main {
    public static void main(String[] args) {

        NotificationStrategy strategy = new SmsNotification("+5730252620287");

        User user = new User(strategy);

        user.notifyUser("Hello World !");
    }
}
*/
