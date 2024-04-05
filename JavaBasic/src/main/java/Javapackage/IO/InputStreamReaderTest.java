package Javapackage.IO;

import java.io.*;
import java.nio.charset.Charset;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\File\\CodeFile\\JavaBasic\\src\\main\\java\\Javapackage\\IO\\111.txt"),"GBK")   InputStreamReader可以指定字符集
        try(FileReader isr = new FileReader("E:\\File\\CodeFile\\JavaBasic\\src\\main\\java\\Javapackage\\IO\\111.txt", Charset.forName("UTF-8"))){ //FileReader是子类，同样可以用，不过需要用charset.forname改一下
            char[] chars = new char[1024];
            int count = 0;
            while ((count = isr.read(chars)) != -1) {
                System.out.println(new String(chars, 0, count));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
