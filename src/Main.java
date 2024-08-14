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