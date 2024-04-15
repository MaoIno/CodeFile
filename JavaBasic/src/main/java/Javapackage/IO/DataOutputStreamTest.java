package Javapackage.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\File\\CodeFile\\JavaBasic\\src\\main\\java\\Javapackage\\IO\\333.txt"));
        byte b = 1;
        short s = 123;
        int i = 534534;
        long l = 12312L;
        float f = 2.3F;
        double d = 3.0;
        boolean flag = false;
        char c = '中';
        String str = "中国";
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(flag);
        dos.writeChar(c);
        dos.writeUTF(str);

        dos.flush();
        dos.close();
    }
}
