package designpattern.facade;

import designpattern.facade.facade.VideoConversionFacade;

import java.io.File;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 21:08
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        // 使用外观模式，提供一个简洁的接口来屏蔽在子系统中复杂的执行逻辑。避免业务逻辑和第三方库的耦合
        File mp4Video = videoConversionFacade.convertVideo("youtubevideo.ogg", "mp4");

        // ...
    }
}
