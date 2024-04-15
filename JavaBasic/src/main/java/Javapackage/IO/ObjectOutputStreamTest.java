package Javapackage.IO;

import java.io.*;
import java.io.FileOutputStream;
import java.util.Date;

//序列化
public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\File\\CodeFile\\JavaBasic\\src\\main\\java\\Javapackage\\IO\\444.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\File\\CodeFile\\JavaBasic\\src\\main\\java\\Javapackage\\IO\\444.txt"))) {
            Date date = new Date();
            oos.writeObject(date);
            Object o = ois.readObject();
            System.out.println(o);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
