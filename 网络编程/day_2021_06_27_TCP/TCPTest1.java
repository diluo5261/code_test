package java2;

import com.sun.org.apache.xpath.internal.operations.String;
import com.sun.security.ntlm.Server;
import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest1 {
    @Test
    public void client(){
        Socket socket = null;
        try {
            //1.创建socket对象,指明服务端的ip地址和端口号
            socket = new Socket("192.168.68.145",5566);
            //2.打开连接到socket的输出流
            OutputStream ops = socket.getOutputStream();
            //3.数据输出
            ops.write("你好,我是客户端.正在发送数据".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭

            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    @Test
    public void server(){
        ServerSocket ss = null;
        Socket socket = null;
        InputStream ips = null;
        try {
            //1.在客户端创建ServerSocket对象,指明自己的端口
            ss = new ServerSocket(5566);

            //2.调用accept(),接受来自客户端的Socket
            socket = ss.accept();

            //3.调用Socket对象的输入流
            ips = socket.getInputStream();

            //4.读取输入流的数
           ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while((len = ips.read(buffer)) != -1){
                baos.write(buffer,0,len);
            }

            System.out.println(baos.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5/资源官博

            if (ips != null){
                try {
                    ips.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
