package day14.exer;

public class AccountTest {
    public static void main(String[] args) {

        Account acc1 = new Account();
        Account acc2 = new Account("qwer",2563.0);
        Account.setRate(5.0);

        System.out.println(acc1.getBalance());
        System.out.println(Account.getRate());

        System.out.println(acc1);
        System.out.println(acc2);
    }
}
