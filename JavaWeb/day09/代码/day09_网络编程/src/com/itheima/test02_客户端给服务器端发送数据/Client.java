package com.itheima.test02_客户端给服务器端发送数据;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //1. 创建客户端的Socket对象. 指定服务器端ip,端口号.
        Socket socket = new Socket("127.0.0.1",12306);

        //2. 获取输出流, 可以往服务器写数据.
        OutputStream os = socket.getOutputStream();
        os.write("约吗?   by 客户端".getBytes());

        //3. 释放资源.
        socket.close();
    }
}
