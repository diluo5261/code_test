package 图书管理系统;

import 图书管理系统.book.BookList;
import 图书管理系统.user.AdminUser;
import 图书管理系统.user.NormalUser;
import 图书管理系统.user.User;

import java.util.Scanner;

public class Main {
    public static User login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = scan.nextLine();

        System.out.println("请输入你的身份 : 1->管理员   0->普通用户");
        int choice = scan.nextInt();

        if (1 == choice ){
            return  new AdminUser(name);
        }else{
            return new NormalUser(name);
        }
    }


    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user =login();
        do {
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }while(true);




    }
}
