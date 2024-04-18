package Javapackage.net;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

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
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))){
            bw.write("客户端请求消息");
            bw.flush();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
