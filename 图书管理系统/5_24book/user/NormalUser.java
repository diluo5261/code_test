package user;

import operation.*;

import java.util.Scanner;

public class NormalUser extends User {

    public NormalUser(String name) {
        super(name);
        iOperations = new IOperation[]{
                new ExitOperation(),
                new SearchOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("****** Normal menu ******");
        System.out.println("hello " + this.name +"welcome to book List");
        System.out.println("1.find book");
        System.out.println("2.borrow book");
        System.out.println("3.return book");
        System.out.println("0.exit book");
        System.out.println("******  menu  end  ******");
        return scan.nextInt();

    }
}
