package designpattern.facade.some_complex_media_library;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 20:51
 * @Description:
 */
public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}
