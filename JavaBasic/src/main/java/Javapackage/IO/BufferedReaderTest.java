package Javapackage.IO;

import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("E:\\File\\CODE\\MavenFiles\\src\\main\\java\\Javapackage\\IO\\111.txt"));
            BufferedWriter bw = new BufferedWriter((new FileWriter("E:\\File\\CODE\\MavenFiles\\src\\main\\java\\Javapackage\\IO\\222.txt",true)))) {
            String s = null;
            char[] chars = new char[120];
            int count = 0;
            while ((count = br.read(chars)) != -1) {
                System.out.println(chars);
            }
            bw.write(chars);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
