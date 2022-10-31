package designpattern.proxy.some_cool_media_library;

import java.util.HashMap;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 23:10
 * @Description: 远程服务接口
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
