package Javapackage.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * ClassName: UDPReceive
 * Description:
 * Author:YoungJan
 * Datetime:下午1:49
 * Version:Master_GitHub 1.0
 */
public class UDPReceive {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(8888);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket((bytes), bytes.length);

        ds.receive(dp);

        String string = new String(bytes, 0, dp.getLength());
        System.out.println(string);

        ds.close();
    }
}
