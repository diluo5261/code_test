package 图书管理系统.user;

import 图书管理系统.book.BookList;
import 图书管理系统.operation.*;

import java.util.Scanner;

public class AdminUser extends User {

    public AdminUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{new ExitOperation(),
                                            new FindOperation(),
                                            new AddOperation(),
                                            new DelOperation(),
                                            new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("=============== 管 理 员 菜 单  ===============");
        System.out.println("hello " + this.name + "欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("=====================================");

        return scan.nextInt();
    }

    @Override
    public void doOperation(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList);

    }
}
