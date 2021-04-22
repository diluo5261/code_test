package day10.exer2;

public class Account {
    private double balance;

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println("存钱成功!");
        }
        return;
    }

    public void withdraw(double amt){
        if (balance >= amt){
            balance -= amt;
            System.out.println("取钱成功!  余额为 :"+ balance);
        }else{
            System.out.println("余额不足!");
        }
    }
}
