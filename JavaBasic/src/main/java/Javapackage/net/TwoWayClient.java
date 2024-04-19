package Javapackage.net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ClassName: TwoWayClient
 * Description:
 * Author:YoungJan
 * Datetime:上午11:14
 * Version:Master_GitHub 1.0
 */
public class TwoWayClient {
    public static void main(String[] args) {
        InetAddress ia = null;
        Socket socket = null;
        BufferedWriter bw = null;
        BufferedInputStream bis =null;
        BufferedOutputStream bos = null;
        BufferedReader br = null;
        int port =9999;
        try {
            ia=InetAddress.getLocalHost();
            socket = new Socket(ia,port);
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bis = new BufferedInputStream(new FileInputStream("E:\\File\\CodeFile\\JavaBasic\\src\\main\\resources\\dogTest.jpg"));
            bos = new BufferedOutputStream(socket.getOutputStream());

            byte[] bytes = new byte[1024*4];
            int count = 0;
            while ((count = bis.read(bytes)) != -1) {
                bos.write(bytes,0,count);
            }
            bos.flush();

            socket.shutdownOutput();

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //char[] chars = new char[1024];
            System.out.println("=================");
            //System.out.println(br.read(chars));

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
