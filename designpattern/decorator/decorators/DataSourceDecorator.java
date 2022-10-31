package designpattern.decorator.decorators;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 17:48
 * @Description: 抽象基础装饰类
 */
public class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    public DataSourceDecorator(DataSource dataSource) {
        this.wrappee = dataSource;
    }


    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
