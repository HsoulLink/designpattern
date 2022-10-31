package designpattern.decorator.decorators;

import java.util.Base64;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 17:50
 * @Description: 加密装饰类
 */
public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data){
        byte[] bytes = data.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] += (byte)1;
        }

        return Base64.getEncoder().encodeToString(bytes);
    }

    private String decode(String data) {
        byte[] bytes = Base64.getDecoder().decode(data);
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] -= (byte) 1;
        }

        return new String(bytes);
    }
}
