import design_patterns.adapter.example1.AudioPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("audio", "song.mp3");
        audioPlayer.play("video", "movie.mp4");
        audioPlayer.play("vlc", "another.vlc");
    }
}