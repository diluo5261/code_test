/*
package day15.java1;

public class USBTest1 {
    public static void main(String[] args) {
        Computer com = new Computer();

        //创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);

        //2、创建了接口的非匿名实现类的匿名对象
        com.transferData(new Flash());

        //3、创建了接口的匿名实现类的非匿名对象
        USB phone = new USB() {
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

        //4、创建了接口的匿名实现类的匿名对象

        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3工作开始！");
            }

            @Override
            public void end() {
                System.out.println("mp3 工作结束！");
            }
        });
    }

}

class Computer {
    public void transferData(USB usb){
        usb.start();
        System.out.println("传输协议i");
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
        System.out.println("U盘开启工作");
    }

    @Override
    public void end() {
        System.out.println("U盘结束工作");

    }
}

class Painter implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作!");
    }

    @Override
    public void end() {
        System.out.println("打印机结束工作!");
    }
}
*/
