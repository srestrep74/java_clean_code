package design_patterns.factory.factory_method.example1;

public class ExcelDocument extends Document{
    @Override
    public void open() {
        System.out.println("Opening Excel document ...");
    }
}
