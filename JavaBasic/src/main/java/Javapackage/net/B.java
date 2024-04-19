package Javapackage.net;

import java.io.*;
import java.net.ServerSocket;

/**
 * ClassName: B
 * Description:
 * Author:YoungJan
 * Datetime:下午1:23
 * Version:Master_GitHub 1.0
 */
public class B {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        int port = 8888;
        try {
            serverSocket = new ServerSocket(port);
            br = new BufferedReader(new InputStreamReader(serverSocket.accept().getInputStream()));
            byte[] bytes = new byte[1024 * 4];
            int count = 0;
            String s = null;
            while ((s=br.readLine()) != null) {
                System.out.println(s);
            }
            System.out.println("===================");
            bw = new BufferedWriter(new OutputStreamWriter(serverSocket.accept().getOutputStream()));
            //bw.write("wwwwwwwwwwwwwww".toCharArray());
            bw.flush();




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
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
