package day12.AccountExer;

public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(){
    }

    /*public Account(int id,double balance,double annuallnterestRate){
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }*/

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId(){
        return this.id;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getAnnuallnterestRate(){
        return this.annuallnterestRate;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnuallnterestRate(double annuallnterestRate){
        this.annuallnterestRate = annuallnterestRate;
    }

    public double getMonthlyInterest(){
        return this.annuallnterestRate / 12;
    }

    public void withdraw(double amount){
        if (this.balance > amount){
            this.balance -= amount;
            System.out.println("取款成功!");
            return ;
        }
        System.out.println("余额不足!");
    }

    public void depoist(double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("成功存入 : " + amount +"元,现有余额 : " + this.balance +"元");
            return ;
        }
        System.out.println("金额错误!");
    }
}
