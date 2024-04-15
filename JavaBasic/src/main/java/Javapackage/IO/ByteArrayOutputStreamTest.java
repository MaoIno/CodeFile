package Javapackage.IO;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamTest {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        baos.write(65);
        baos.write(66);
        baos.write(67);

        byte[] byteArray = baos.toByteArray();
        for(byte b : byteArray) {
            System.out.println(b);
        }
    }
}
