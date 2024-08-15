package design_patterns.adapter.example1;

// Existent class (Adaptee)
public class VideoPlayer {
    public void playVideo(String filename){
        System.out.println("Playing video file : " + filename);
    }
}
