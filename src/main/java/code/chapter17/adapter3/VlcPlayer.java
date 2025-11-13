package code.chapter17.adapter3;

// VLC播放器（实现高级媒体接口）
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放VLC文件: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 不支持MP4
    }
}