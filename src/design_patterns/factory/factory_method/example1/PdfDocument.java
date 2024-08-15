package design_patterns.factory.factory_method.example1;

public class PdfDocument extends Document{
    @Override
    public void open() {
        System.out.println("Opening PDF document ...");
    }
}
