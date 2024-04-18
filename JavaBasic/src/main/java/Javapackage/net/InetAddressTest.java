package Javapackage.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddressTest
 * Description:
 * Author:YoungJan
 * Datetime:下午10:36
 * Version:Master_GitHub 1.0
 */
public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        /*//获取本机的IP和主机名
        InetAddress ia = InetAddress.getLocalHost();
        System.out.println(ia.getHostAddress());
        System.out.println(ia.getHostName());
        //通过域名过去IP和主机名
        InetAddress ia1 = InetAddress.getByName("www.baidu.com");
        System.out.println(ia1.getHostName());
        System.out.println(ia1.getHostAddress());*/

        URL u = new URL("https://tianqi.qq.com/");
        /*System.out.println("协议:"+u.getProtocol()); //获取协议
        System.out.println("域名:"+u.getHost());//获取域名
        System.out.println("默认端口："+u.getDefaultPort());//获取默认端口
        System.out.println("使用端口："+u.getPort());//获取端口
        System.out.println("获取路径："+u.getPort());//获取路径
        System.out.println("获取文件："+u.getFile());//获取文件
        System.out.println("获取数据："+u.getQuery());//获取数据
        System.out.println("获取锚点："+u.getRef());//获取锚点*/
        /*InputStream is = u.openStream();
        BufferedReader br = new BufferedReader((new InputStreamReader(is)));
        String s = null;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }*/
    }
}
