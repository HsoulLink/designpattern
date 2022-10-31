package designpattern.proxy.some_cool_media_library;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 23:11
 * @Description: 视频文件
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
