package designpattern.decorator.decorators;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 17:37
 * @Description: 定义了读取和写入操作的通用数据接口
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
