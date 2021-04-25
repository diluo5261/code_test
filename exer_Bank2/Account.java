package day10.exer_Bank2;

public class Account {
    private double balance;

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt){
        if (amt > 0){
            this.balance += amt;
            System.out.println("成功存入 : "+ amt + "元, 现有余额为: "
                        + this.balance + "元");
        }
    }

    public void withdraw(double amt){
        if(this.balance > amt){
            this.balance -= amt;
            System.out.println("成功取出: " + amt + "元, 现有余额 : " + this.balance+ "元");
        }else{
            System.out.println("余额不足,提取失败!");
        }
    }
}
