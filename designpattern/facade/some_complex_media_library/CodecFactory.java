package designpattern.facade.some_complex_media_library;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 20:54
 * @Description:
 */
public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if(type.equals("mp4")){
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
