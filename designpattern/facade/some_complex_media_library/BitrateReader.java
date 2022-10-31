package designpattern.facade.some_complex_media_library;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 20:57
 * @Description:
 */
public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec){
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
