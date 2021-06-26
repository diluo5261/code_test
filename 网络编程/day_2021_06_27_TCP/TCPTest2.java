package java2;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest2 {

    @Test
    public void celient(){
        Socket socket = null;
        OutputStream ops = null;
        FileInputStream fis = null;
        try {
            //1.创建Socket对象,指明服务端的ip地址和端口号
            socket = new Socket("192.168.68.145",8989);

            //2.打开连接socket对象的输出方法
            ops = socket.getOutputStream();
            fis = new FileInputStream("picture.jpg");

            //3.进行数据的读写操作
            byte[] buffer = new byte[10];
            int len;
            while((len = fis.read(buffer)) != -1){
                ops.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ops != null){
                try {
                    ops.close();
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
        }
    }

    @Test
    public void server(){
        ServerSocket ss = null;
        Socket socket = null;
        InputStream ips = null;
        FileOutputStream fop = null;
        try {
            //1.创建服务器端的Service Socket接口,指明自己的端口
            ss = new ServerSocket(8989);

            //2.调用accept(),表示接受来自客户端的Socket
            socket = ss.accept();

            //3.调用socket对象的输入流
            ips = socket.getInputStream();
            fop = new FileOutputStream("picture2.jpg");

            //4.获取输入流中的数据
            byte [] buffer = new byte[1024];
            int len;
            while((len = ips.read(buffer)) != -1){
                fop.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭文件

            if (fop != null){
                try {
                    fop.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

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
