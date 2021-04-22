package day10.exer1;

public class Account {
    private int id;
    private double balance;
    private double annualinterestRate;

    public Account (int id , double balance , double annualinterestRate){
        this.id =id;
        this.balance = balance;
        this.annualinterestRate = annualinterestRate;
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

    public double getAnnualinterestRate() {
        return annualinterestRate;
    }

    public void setAnnualinterestRate(double annualinterestRate) {
        this.annualinterestRate = annualinterestRate;
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("余额不足,取款失败!");
            return ;
        }
        balance -= amount;
        System.out.println("成功取出:" + amount +"元\n余额: " + balance + "元");
    }

    public void depoist(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("成功存入: " + amount +"元 , 余额 :" + balance + "元");
        }
        return;
    }
    /*private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id , double balance , double annualInterestRate){
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
        if(balance < amount){
            System.out.println("余额不足,提取失败! 剩余余额: " + balance);
            return;
        }
        balance -= amount;
        System.out.println("成功取出:" + amount + "元");
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("成功存入 " + amount +"元");
        }
    }*/
}
    /*private int id; //账号
    private double balance ; //余额
    private double annualinterestRate;//年利率

    public Account(int id, double balance , double annualinterestRate){
        this.id = id;
        this.balance = balance;
        this.annualinterestRate = annualinterestRate;
    }

    public int getId(){
        return  this.id;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getAnnualinterestRate(){
        return this.annualinterestRate;
    }

    public void setId(int id){
        this.id = id;
    }

   public void setBalance(double balance){
        this.balance = balance;
   }

   public void setAnnualinterestRate(double annualinterestRate){
        this.annualinterestRate = annualinterestRate;
   }

   //再提款方法中需要判断用户约是否满足提款需求

    public void withDraw(double amount){//取钱
        if (this.balance < amount){
            System.out.println("余额不足!提款失败!");
            return;
        }
        this.balance -= amount;
        System.out.println("成功取出: "+ amount);
    }

    //存钱
    public void deposit(double amount){//存钱
        if(amount > 0){
            balance += amount;
            System.out.println("成功存入!"+ amount);
        }

    }*/



