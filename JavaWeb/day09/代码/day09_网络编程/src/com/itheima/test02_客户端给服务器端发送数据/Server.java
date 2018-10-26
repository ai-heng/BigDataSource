package com.itheima.test02_客户端给服务器端发送数据;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //1. 创建服务器端的Socket, 指定端口号.
        ServerSocket server = new ServerSocket(12306);

        //2. 监听客户端的请求, 只要有客户端申请建立建立.
        //校验数据合法后, 创建一个Socket负责和该客户端的交互.
        System.out.println(1);
        Socket socket = server.accept();
        System.out.println(2);

        //3. 创建输入流, 读取客户端发送的数据.
        InputStream is = socket.getInputStream();

        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String str = new String(bys,0,len);

        //4. 打印数据.
        System.out.println(str);

        //5. 释放资源.
        socket.close();
    }
}
