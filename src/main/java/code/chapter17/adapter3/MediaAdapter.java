package code.chapter17.adapter3;

// 媒体适配器（将高级媒体接口适配为普通媒体接口）
public class MediaAdapter implements MediaPlayer {
    // 持有被适配的对象
    private AdvancedMediaPlayer advancedMediaPlayer;

    // 根据文件类型创建对应的高级播放器
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    // 实现目标接口的方法，内部调用被适配对象的方法
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}