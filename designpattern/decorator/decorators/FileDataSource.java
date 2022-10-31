package designpattern.decorator.decorators;

import java.io.*;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 17:38
 * @Description:
 */
public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name){
        this.name = name;
    }


    @Override
    public void writeData(String data) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(name);
            fos.write(data.getBytes());
            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        // try括号中所有实现Closeable的类声明都可以写在里面，括号里面可以写多行语句，该写法会自动关闭括号中的资源
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new String(buffer);
    }
}
