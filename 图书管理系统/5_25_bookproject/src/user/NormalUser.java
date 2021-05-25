package user;

import operation.*;

import java.util.Scanner;

public class NormalUser extends User {

    public NormalUser(String name) {
        super(name);
        this.iOperation = new IOperation[]{
                new ExitOperation(),
                new SearchOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("hello " + this.name +" welcome to Normal menu!");
        System.out.println("1.search book");
        System.out.println("2.borrow book");
        System.out.println("3.return book");
        System.out.println("0.exit book");
        System.out.println("input your choice");

        int choice = scan.nextInt();
        return choice;
    }
}
