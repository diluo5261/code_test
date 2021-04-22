package day10.exer2;

public class Bank {
    private Customer[] customer ;
    private int numberOfCustomer;

    public Bank(){
        customer = new Customer[10];
    }

    public void addCustomer(String f ,String l){
        Customer cust = new Customer(f,l);
        customer[numberOfCustomer++] = cust;
    }

    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }

    public Customer getCustomer(int index){
        if (index >= 0 && index < numberOfCustomer){
            return customer[index];
        }
        return null;
    }
}
