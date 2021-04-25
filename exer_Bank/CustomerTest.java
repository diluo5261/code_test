package day10.exer_Bank1;

public class CustomerTest {
    public static void main(String[] args) {

    Customer cust = new Customer("Jane","Smith");
    Account acct = new Account(1000,2000,0.0123);
    cust.setAccount(acct);

    cust.getAccount().deposit(100);//存入100元
    cust.getAccount().withdraw(960);//取出960
    cust.getAccount().withdraw(2000);//取出2000

        cust.show();


    }
}
