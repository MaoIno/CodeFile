package Javapackage.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: Server
 * Description:
 * Author:YoungJan
 * Datetime:上午12:23
 * Version:Master_GitHub 1.0
 */
public class Server {
    static {
        System.out.println("Server action complete");
    }
    public static void main(String[] args) {
        int port = 8888;
        try(ServerSocket serverSocket = new ServerSocket(port);
            //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(serverSocket.accept().getOutputStream()));
            //BufferedReader br = new BufferedReader(new InputStreamReader(serverSocket.accept().getInputStream()));
            BufferedInputStream bis = new BufferedInputStream(serverSocket.accept().getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\File\\CodeFile\\JavaBasic\\src\\main\\resources\\dog.png"));
           ){

            byte[] bytes = new byte[1024];
            int count = 0;
            while ((count = bis.read(bytes)) != -1) {
                bos.write(bytes,0,count);
            }

            bos.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
