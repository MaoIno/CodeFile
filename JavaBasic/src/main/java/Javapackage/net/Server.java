package Javapackage.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
    public static void main(String[] args) {
        int port = 8888;
        try (ServerSocket serverSocket = new ServerSocket(port);
            BufferedReader br = new BufferedReader(new InputStreamReader(serverSocket.accept().getInputStream()))) {

            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
