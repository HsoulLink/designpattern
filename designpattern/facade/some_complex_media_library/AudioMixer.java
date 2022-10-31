package designpattern.facade.some_complex_media_library;

import java.io.File;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 20:58
 * @Description:
 */
public class AudioMixer {
    public File fix(VideoFile result) {
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
