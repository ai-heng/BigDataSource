package com.itheima.test01_IP地址包装类;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        //String: "192.168.106.46"   -->    IP地址对象(InetAddress)
        //String ip = "192.168.106.46";
        String host = "HangGe";
        //InetAddress.getByName("可以是ip/也可以是主机名");
        InetAddress inet = InetAddress.getByName(host);
        System.out.println(inet);

        //IP地址对象(InetAddress)      -->  String: "192.168.106.46"
        String ip2 = inet.getHostAddress();
        String host2 = inet.getHostName();
        System.out.println("ip: " + ip2 + "\r\n" + "host: " + host2);
    }
}
