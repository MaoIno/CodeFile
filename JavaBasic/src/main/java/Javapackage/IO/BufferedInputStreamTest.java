package Javapackage.IO;

import java.io.*;
import java.io.FileOutputStream;


public class BufferedInputStreamTest {
    public static void main(String[] args) {
        long times = System.currentTimeMillis();
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\File\\CODE\\MavenFiles\\src\\main\\java\\Javapackage\\IO\\111.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\File\\CODE\\MavenFiles\\src\\main\\java\\Javapackage\\IO\\222.txt",true))){
            byte[] bytes = new byte[bis.available()];
            int count = 0;
            while ((count = bis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, count));
            }
            bos.write(bytes);
            bos.flush();
            System.out.println("hello");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long times1 = System.currentTimeMillis();
        System.out.println(times1 - times);
    }
}
