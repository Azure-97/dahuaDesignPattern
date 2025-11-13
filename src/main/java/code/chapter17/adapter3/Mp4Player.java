package code.chapter17.adapter3;

// MP4播放器（实现高级媒体接口）
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // 不支持VLC
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放MP4文件: " + fileName);
    }
}