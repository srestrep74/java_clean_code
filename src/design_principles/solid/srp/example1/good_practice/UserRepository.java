package design_principles.solid.srp.example1.good_practice;

// This class handles User operations in the database
public class UserRepository {
    public void save(User user){
        System.out.println("User Saved to database");
    }
}
