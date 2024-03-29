package day10.exer_Bank1;

public class Account {
    private int id;  //账号
    private double balance; //余额
    private double annualInterestRate; //年利率

    public Account (int id , double balance , double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
        //取钱
    public void withdraw(double amount){
        if (this.balance < amount){
            System.out.println("余额不足,取款失败!");
            return;
        }
        this.balance += amount;
        System.out.println("成功取出 :" + amount + " 元 ,现有余额 :"
                            + this.balance + "元");
    }
    //存钱
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("成功存入 : "+ amount + "元  ,现有余额 :"
                            +this.balance + "元" );
    }


}
