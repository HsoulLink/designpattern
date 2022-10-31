package designpattern.proxy.proxy;

import designpattern.proxy.some_cool_media_library.ThirdPartyYouTubeClass;
import designpattern.proxy.some_cool_media_library.ThirdPartyYouTubeLib;
import designpattern.proxy.some_cool_media_library.Video;

import java.util.HashMap;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 23:21
 * @Description: 缓存代理
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youTubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        youTubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if(cachePopular.isEmpty()){
            cachePopular = youTubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }

        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);

        if(video == null){
            video = youTubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }

        return video;
    }

    public void reset(){
        cachePopular.clear();
        cacheAll.clear();
    }
}
