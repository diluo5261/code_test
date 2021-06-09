package day14.bankexer;

public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account("666666",56598);

        Account.setRate(0.012);
        Account.setMinMoney(100);

        System.out.println(acc1.getBalance());
        System.out.println(acc1.getId());
        System.out.println(acc1.getPassword());
        System.out.println(Account.getRate());
    }
}
