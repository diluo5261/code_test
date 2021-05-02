package day12.AccountExer;

public class CheckAccount extends Account {
    private double overdraft; //可透支金额

    public CheckAccount(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annuallnterestRate, double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() > amount){ //自己本身存款足够
//            setBalance(getBalance() - amount);
            super.withdraw(amount);
            System.out.println("成功取出 : " + amount + "元");
        }else if (this.overdraft > amount - getBalance()){  //本身存款加透支额度够
            double tmp = amount - getBalance();
            overdraft -= tmp;
            setBalance(0);
//            super.withdraw(getBalance());
            System.out.println("取款成功 : 透支额度为 : " + tmp + "元");
        }else{
            System.out.println("超过可透支的额度!取款失败!");
        }
    }
}
