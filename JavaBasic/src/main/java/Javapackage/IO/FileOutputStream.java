package Javapackage.IO;

import java.io.*;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileOutputStream {
    public static void main(String[] args) {
        try (InputStream in = new java.io.FileInputStream("E:\\File\\CODE\\MavenFiles\\src\\main\\java\\Javapackage\\IO\\111.txt");
             OutputStream os = new java.io.FileOutputStream("E:\\File\\CODE\\MavenFiles\\src\\main\\java\\Javapackage\\IO\\222.txt",false)) {
            byte[] bytes = new byte[in.available()];
            int count = in.read(bytes);
            byte[] bytess = new String(bytes, 0, count).getBytes();
            os.write(bytess);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
