package day10.exer_Bank2;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("张","三");

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().deposit(5000);
        bank.getCustomer(0).getAccount().withdraw(600);

        System.out.println("客户 : "+ bank.getCustomer(0).getFirstName()+
                                    bank.getCustomer(0).getLastName()+" 现有余额 : " +bank.getCustomer(0).getAccount().getBalance());

        bank.addCustomer("李","四");
        System.out.println("银行客户个数 : " + bank.getNumberOfCustomer());

    }
}
