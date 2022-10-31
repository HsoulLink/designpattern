package designpattern.proxy;

import designpattern.proxy.downloader.YouTubeDownloader;
import designpattern.proxy.proxy.YouTubeCacheProxy;
import designpattern.proxy.some_cool_media_library.ThirdPartyYouTubeClass;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 23:29
 * @Description: 初始化代码
 */
public class Demo {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);

        System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YouTubeDownloader downloader){
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms");
        return estimatedTime;
    }
}
