package design_principles.solid.srp.example1.bad_practice;

public class User {
    private String name ;
    private String email ;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    // Getters and Setters

    public void saveToDatabase(){
        System.out.println("User saved to Database");
    }
}

/*
This class User has two responsibilities:
- Manage the user data (name, email)
- Save the user on db

So here we are violating the srp.
*/
