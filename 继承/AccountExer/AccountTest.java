package day12.AccountExer;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);
        account.withdraw(3000);
        System.out.println("余额为: " + account.getBalance() + "元");

        account.withdraw(2500);
        account.depoist(3000);
        System.out.println("当前余额为 : " + account.getBalance());
        System.out.println("月利率为 : " + account.getMonthlyInterest()*100 + "%");
    }


}
