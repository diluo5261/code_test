package test1;

public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);

        p.sendEmail();
        p.playGame();

        //匿名对象
       // new Phone().playGame();
        new Phone().price = 1555;
        new Phone().showprice();

        //**************************

        PhoneMall mall = new PhoneMall();
        //mall.show(p); //正常情况下
        mall.show(new Phone());
    }


}

class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();

    }
}



class Phone{
    double price;//价格

    public  void sendEmail(){
        System.out.println("send email");
    }

    public  void playGame(){
        System.out.println("play game");
    }

    public void showprice(){
        System.out.println(price);
    }
}
