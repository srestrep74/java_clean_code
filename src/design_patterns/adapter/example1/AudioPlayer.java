package design_patterns.adapter.example1;

public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("audio")){
            System.out.println("Playing audio file : " + filename);
        }else if(audioType.equalsIgnoreCase("video")){
            mediaAdapter = new MediaAdapter(new VideoPlayer());
            mediaAdapter.play(audioType, filename);
        }else{
            System.out.println("Invalid Media. " + audioType + " format not supported");
        }
    }
}

/*
Main Example :

import design_patterns.adapter.example1.AudioPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("audio", "song.mp3");
        audioPlayer.play("video", "movie.mp4");
        audioPlayer.play("vlc", "another.vlc");
    }
}

*/
