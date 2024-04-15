package Javapackage.IO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * available :直接流中剩余
 * in.read(bytes)；获取数组中的元素个数，意思就是读到了多少个，然后返回读到的个数
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            in = new FileInputStream("JavaBasic/src/main/java/Javapackage/IO/111.txt");
            //int read = in.read(); 一次读一个字节
            byte[] bytes = new byte[in.available()];
            int count = in.read(bytes);
            System.out.println(new String(bytes, 0, count));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
