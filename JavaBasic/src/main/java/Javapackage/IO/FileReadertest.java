package Javapackage.IO;

import java.io.*;

public class FileReadertest {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("E:\\File\\CodeFile\\JavaBasic\\src\\main\\java\\Javapackage\\IO\\111.txt");
             FileWriter fw = new FileWriter("E:\\File\\CodeFile\\JavaBasic\\src\\main\\java\\Javapackage\\IO\\222.txt",false)
             ) {
            char[] chars = new char[512];
            fw.write(new String(chars , 0 , fr.read(chars)).toCharArray());
            fw.append("asdfasdfasdfasdf");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
