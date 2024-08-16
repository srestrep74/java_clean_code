package design_patterns.strategy.example2;

import design_patterns.strategy.example2.concretes.BasicCameraApp;
import design_patterns.strategy.example2.concretes.PhoneCameraApp;
import design_patterns.strategy.example2.strategies.Email;

public class App {
    public static void main(String[] args) {
        PhoneCameraApp camera = new BasicCameraApp();

        camera.setShareStrategy(new Email());

        camera.take();
        camera.edit();
        camera.save();
        camera.share();
    }
}
