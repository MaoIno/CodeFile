package Javapackage.net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * ClassName: A
 * Description:
 * Author:YoungJan
 * Datetime:下午1:23
 * Version:Master_GitHub 1.0
 */
public class A {
    public static void main(String[] args) {
        InetAddress ia = null;
        Socket socket = null;
        BufferedWriter bw = null;
        BufferedReader br = null;
        int port =8888;
        try {
            ia = InetAddress.getLocalHost();
            socket = new Socket(ia,port);
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("wwwwwwwwwwwwwww\n");
            bw.flush();
            socket.shutdownOutput();
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            byte[] bytes = new byte[1024 * 4];
            int count = 0;
            String s = null;
            char[] chars = new char[120];
            while ((count = br.read(chars)) != -1) {
                System.out.println(chars);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
