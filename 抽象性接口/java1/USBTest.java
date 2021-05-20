package day15.java1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        Flash flash = new Flash();
        //1、接口非匿名   对象非匿名
        com.transferData(flash);

        //2、接口非匿名     对象匿名
        com.transferData(new Painter());

        //3、接口匿名   对象非匿名
        USB phone = new USB(){

            @Override
            public void start() {
                System.out.println("手机工作开始！");
            }

            @Override
            public void end() {
                System.out.println("手机工作结束！");
            }
        };
        com.transferData(phone);

        //4、接口匿名    对象匿名
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3 start work!");
            }

            @Override
            public void end() {
                System.out.println("mp3 end work!");
            }
        });
    }


}

class Computer {
    public void transferData(USB usb){
        usb.start();
        System.out.println("具体传输协议");
        usb.end();
    }
}

interface USB{
    void start();

    void end();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘工作开始！");
    }

    @Override
    public void end() {
        System.out.println("U盘工作结束！");
    }
}

class Painter implements USB{

    @Override
    public void start() {
        System.out.println("打印机工作开始！");
    }

    @Override
    public void end() {
        System.out.println("打印机工作结束！");
    }
}
