package design_principles.solid.srp.example1.good_practice;

public class User {
    private String name ;
    private String email ;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
}

/*Here the class only has one responsibility*/