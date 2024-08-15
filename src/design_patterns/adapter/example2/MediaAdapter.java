package design_patterns.adapter.example2;

// Adapter class
public class MediaAdapter implements MediaPlayer{

    private VideoPlayer videoPlayer;

    public MediaAdapter(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("video")){
            videoPlayer.playVideo(filename);
        }else{
            System.out.println("Invalid Media . " + audioType + " format not supported");
        }
    }
}
