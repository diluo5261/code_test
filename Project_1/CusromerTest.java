package day10.exer1;

public class CusromerTest {
    //1、创建一个 Customer ，名字叫 Jane Smith, 他有一个账号为 1000，余额为 2000 元，
    //年利率为 1.23％ 的账户。
    public static void main(String[] args) {

    Customer cus = new Customer("Jane","Smith");
    Account acct = new Account(1000,2000,0.0123);

    cus.setAccount(acct);

    cus.getAccount().depoist(100);
    cus.getAccount().withdraw(960);
    cus.getAccount().withdraw(2000);
    }














    /*public static void main(String[] args) {

    Customer cust = new Customer("Jane" , "Smith");
    Account acct = new Account(1000,2000,0.123);

    cust.setAccount(acct);

    cust.getAccount().deposit(100);  //存入100元
    cust.getAccount().withdraw(960);  //取出960元
    cust.getAccount().withdraw(2000);  // 取出2000元

    }*/





}








    /*public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");
        Account acct = new Account(1000,2000,0.0123);
        cust.setAccount(acct);

        cust.getAccount().deposit(100);
        cust.getAccount().withDraw(960);
        cust.getAccount().withDraw(2000);
        System.out.println("Customer[ " +cust.getLastName()+","+cust.getFirstName()
                            +"] has a account : id is "+ cust.getAccount().getAnnualinterestRate()*100+"%, balance is "
                            +cust.getAccount().getBalance());*/



