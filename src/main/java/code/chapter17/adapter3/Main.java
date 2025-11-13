package code.chapter17.adapter3;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");    // 原生支持
        audioPlayer.play("mp4", "movie.mp4");   // 通过适配器支持
        audioPlayer.play("vlc", "show.vlc");    // 通过适配器支持
        audioPlayer.play("avi", "video.avi");   // 不支持的格式
    }
}