package day14.exer;

public class Account {
    private int id;
    private String password;
    private double balance;
    private static double rate;
    private static double minMoney = 1.0;
    private static int init = 1001;

    public Account() {
        this.id = init++;
    }

    public Account(String password, double balance) {
        this.password = password;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }


    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
