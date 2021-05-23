package 图书管理系统.user;

import 图书管理系统.book.BookList;
import 图书管理系统.operation.*;

import java.util.Scanner;

public class NormalUser extends User{

    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{new ExitOperation(),new FindOperation(),new BorrowOperation(),new ReturnOperation()};
    }

    @Override
    public int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("=============== 普 通 菜 单  ===============");
        System.out.println("hello " + this.name + "欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("=====================================");

        int choice = scan.nextInt();
        return choice;
    }

    @Override
    public void doOperation(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList);
    }


}
