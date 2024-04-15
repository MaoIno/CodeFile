package Javapackage.IO;

import java.io.*;

public class DataInputStreamTest {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("E:\\File\\CodeFile\\JavaBasic\\src\\main\\java\\Javapackage\\IO\\333.txt");
             DataInputStream dis = new DataInputStream(is)) {
            byte b = dis.readByte();
            short s = dis.readShort();
            int i = dis.readInt();
            long l = dis.readLong();
            float f = dis.readFloat();
            double d = dis.readDouble();
            boolean flag = dis.readBoolean();
            char c = dis.readChar();
            String str = dis.readUTF();
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(flag);
            System.out.println(c);
            System.out.println(str);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
