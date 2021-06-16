class Bank{
    //1.私有化类的构造器
    private Bank(){

    }

    //2.内部创建类的对象
    //4.要求此对象也必须是static的
    private static Bank instance = new Bank();

    //3.提供public static的返回类的对象的方法
    public static Bank getInstance(){
        return instance;
    }
}

public class Singleton1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);
    }
}