package design_patterns.factory.factory_method.example1;

public class WordDocument extends Document{
    @Override
    public void open() {
        System.out.println("Opening Word document ...");
    }
}
