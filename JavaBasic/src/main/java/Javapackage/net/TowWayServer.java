package Javapackage.net;

import java.io.*;
import java.net.ServerSocket;
import java.util.Arrays;

/**
 * ClassName: TowWayServer
 * Description:
 * Author:YoungJan
 * Datetime:上午11:18
 * Version:Master_GitHub 1.0
 */
public class TowWayServer {
    public static void main(String[] args) {
        int port = 9999;
        ServerSocket sS=null;
        BufferedInputStream bis=null;
        BufferedOutputStream bos = null;
        BufferedWriter bw = null;
        try {
            sS = new ServerSocket(port);
            bis = new BufferedInputStream(sS.accept().getInputStream());
            bos = new BufferedOutputStream(new FileOutputStream("E:\\File\\CodeFile\\JavaBasic\\src\\main\\resources\\dog.jpg"));

            byte[] bytes = new byte[1024*4];
            int count = 0;
            while ((count = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, count);
            }
            bos.flush();

            bw = new BufferedWriter(new OutputStreamWriter(sS.accept().getOutputStream()));
            bw.write(Arrays.toString("finished!".getBytes()));
            //bw.write("\n");
            bw.flush();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                sS.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
