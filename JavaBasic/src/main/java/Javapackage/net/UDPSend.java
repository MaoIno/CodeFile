package Javapackage.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ClassName: UDPSend
 * Description:
 * Author:YoungJan
 * Datetime:下午1:49
 * Version:Master_GitHub 1.0
 */
public class UDPSend {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        InetAddress ia = InetAddress.getLocalHost();
        byte[] bytes = "你好这个世界".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length,ia,8888);
        ds.send(dp);
    }

}
