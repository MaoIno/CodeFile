package Javapackage.IO;
import java.io.*;
import java.io.FileOutputStream;

public class BufferedInputStreamTest {
    public static void main(String[] args) {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\File\\CodeFile\\JavaBasic\\src\\main\\java\\Javapackage\\IO\\111.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\File\\CodeFile\\JavaBasic\\src\\main\\java\\Javapackage\\IO\\222.txt",true))){
            byte[] bytes = new byte[bis.available()];
            int count = 0;
            while ((count = bis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, count));
            }
            bos.write(bytes);
            bos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
