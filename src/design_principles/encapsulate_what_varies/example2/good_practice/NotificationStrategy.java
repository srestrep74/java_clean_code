package design_principles.encapsulate_what_varies.example2.good_practice;

// Abstraction that defines a method to how notify a user
public interface NotificationStrategy {
    void notifyUser(String message);
}
