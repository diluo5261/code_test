lass Bank{
    //1.私有化类的构造器
    private Bank(){};

    //2.声明类的对象,没有初始化
    //4.方法是static的,要求此对象也是static的
    private static Bank instance = null;

    //3.提供public static的返回类的对象的方法
    public static Bank getInstance(){
        if(instance == null){
            instance = new Bank();
        }
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