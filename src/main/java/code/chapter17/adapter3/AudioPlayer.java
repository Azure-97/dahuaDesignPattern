package code.chapter17.adapter3;

// 音频播放器（客户端直接使用的类）
public class AudioPlayer implements MediaPlayer {
    // 持有适配器
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // 支持的原生格式（如MP3）
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("播放MP3文件: " + fileName);
        }
        // 不支持的格式，使用适配器
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("不支持的格式: " + audioType);
        }
    }
}