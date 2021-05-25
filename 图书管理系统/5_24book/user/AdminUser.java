package user;

import operation.*;

import java.util.Scanner;

public class AdminUser extends User {

    public AdminUser(String name) {
        super(name);
        iOperations = new IOperation[]{
                new ExitOperation(),
                new SearchOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("****** Admin menu ******");
        System.out.println("hello" + this.name +"welcome to book exer");
        System.out.println("1.find book");
        System.out.println("2.add  book");
        System.out.println("3.del  book");
        System.out.println("4.show book");
        System.out.println("0.exit book");
        System.out.println("******  menu  end ******");
        int choice = scan.nextInt();
        return choice;
    }
}
