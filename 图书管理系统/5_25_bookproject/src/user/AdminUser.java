package user;

import operation.*;

import java.util.Scanner;

public class AdminUser extends User{

    public AdminUser(String name) {
        super(name);
        this.iOperation = new IOperation[]{
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
        System.out.println("hello " + this.name +" welcome to Admin menu!");
        System.out.println("1.search book");
        System.out.println("2.add book");
        System.out.println("3.delete book");
        System.out.println("4.display book");
        System.out.println("0.exit book");
        System.out.println("input your choice:>");

        int choice = scan.nextInt();
        return choice;

    }
}
