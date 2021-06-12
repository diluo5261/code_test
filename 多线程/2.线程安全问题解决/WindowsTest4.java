package day02.Test1;

class MyThread4 extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while(true){
            show();
        }
    }

    public static synchronized void show(){
        if (ticket > 0){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()  + ticket);
            ticket--;
        }
    }
}

public class WindowsTest4 {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4();
        MyThread4 t2 = new MyThread4();
        MyThread4 t3 = new MyThread4();

        t1.setName("窗口一:");
        t2.setName("窗口二:");
        t3.setName("窗口三:");

        t1.start();
        t2.start();
        t3.start();
    }
}
