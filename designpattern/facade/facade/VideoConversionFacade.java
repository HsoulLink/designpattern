package designpattern.facade.facade;

import designpattern.facade.some_complex_media_library.*;

import java.io.File;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 21:01
 * @Description: 使用外观模式，提供了进行视频转化的简单接口
 * 使用外观模式，屏蔽了子系统的复杂程度，提供了一些简洁的接口方便客户端调用
 */
public class VideoConversionFacade {
    public File convertVideo(String fileName, String format){
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if(format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
