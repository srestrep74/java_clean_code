package design_patterns.adapter.example1;

// Client
public class DuckSimulator {
    public static void main(String [] args){
        Duck duck = new MallardDuck();
        testDuck(duck);

        Turkey turkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(turkey);
        testDuck(adapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
