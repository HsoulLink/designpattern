package designpattern.decorator.decorators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 17:57
 * @Description: 压缩装饰类
 */
public class CompressionDecorator extends DataSourceDecorator {
    private int compLevel = 6;

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    public int getCompLevel() {
        return compLevel;
    }

    public void setCompLevel(int compLevel) {
        this.compLevel = compLevel;
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String stringData){
        byte[] data = stringData.getBytes();
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(512);
            // 这个压缩类实际上也用到了装饰者模式
            DeflaterOutputStream dos = new DeflaterOutputStream(baos, new Deflater(compLevel));
            dos.write(data);
            dos.close();
            baos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            return null;
        }
    }

    private String decompress(String stringData){
        byte[] data = Base64.getDecoder().decode(stringData);
        try {
            InputStream is = new ByteArrayInputStream(data);
            InflaterInputStream iin = new InflaterInputStream(is);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(512);
            int b;
            while( (b = iin.read()) != -1 ){
                bos.write(b);
            }
            is.close();
            iin.close();
            bos.close();

            return new String(bos.toByteArray());
        }catch (IOException e) {
            return null;
        }
    }
}
