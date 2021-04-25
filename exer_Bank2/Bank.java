package day10.exer_Bank2;

public class Bank {
    private Customer [] customers = new Customer[10];
    private int numberOfCustomer;

    public Bank(){

    }

    public void addCustomer(String f,String l){
        customers[this.numberOfCustomer++] = new Customer(f,l);
    }

    public int getNumberOfCustomer(){
        return this.numberOfCustomer;
    }

    public Customer getCustomer(int index){
        if (this.numberOfCustomer >= index && index >= 0){
            return customers[index];
        }
        return null;



    }


}
