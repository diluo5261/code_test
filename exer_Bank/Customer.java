package day10.exer_Bank1;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f , String l){
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Account getAccount(){
        return this.account;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public void show(){
        System.out.println("Custome [" + getLastName() +" , "+ getFirstName()
                + "] has a account : id is"+ getAccount().getId()
                +", annualInterestRate is "+ this.getAccount().getAnnualInterestRate()*100 + "%, balance is "
                + getAccount().getBalance());
    }
}
//
//
//
//