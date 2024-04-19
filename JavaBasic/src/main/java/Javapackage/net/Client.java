package Javapackage.net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * ClassName: Client
 * Description:
 * Author:YoungJan
 * Datetime:上午12:23
 * Version:Master_GitHub 1.0
 */
public class Client {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getLocalHost();
        int port = 8888;
        try(Socket clientSocket = new Socket(ia, port);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\File\\CodeFile\\JavaBasic\\src\\main\\resources\\dogTest.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(clientSocket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            ){
            byte[] bytes = new byte[1024];
            int count = 0;
            while ((count = bis.read(bytes)) != -1) {
                bos.write(bytes,0,count);
                //bos1.write(bytes,0,count);
            }
            bw.flush();
            //bos1.flush();

            /*String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }*/
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
