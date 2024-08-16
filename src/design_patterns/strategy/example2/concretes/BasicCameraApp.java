package design_patterns.strategy.example2.concretes;

public class BasicCameraApp extends PhoneCameraApp{
    @Override
    public void edit() {
        System.out.println("Editing from Basic camera app");
    }
}
