package day12.AccountExer;

public class CheckAccountTest {
    public static void main(String[] args) {

    CheckAccount acct = new CheckAccount(1122,20000,0.045,5000);
    acct.withdraw(5000);
    System.out.println("账户余额 : " + acct.getBalance() + "元,可透支金额为 : " + acct.getOverdraft() + "元");

    acct.withdraw(18000);
    System.out.println("账户余额 : " + acct.getBalance() + "元,可透支金额为 : " + acct.getOverdraft() + "元");

    acct.withdraw(3000);
    System.out.println("账户余额 : " + acct.getBalance() + "元,可透支金额为 : " + acct.getOverdraft() + "元");




    }
}
