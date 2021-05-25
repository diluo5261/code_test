import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static User login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("input your name:>");
        String name = scan.nextLine();
        System.out.println("input your identify:> 1.Admin 2.Normal");
        int choice = scan.nextInt();


        if (choice == 1){
            return new AdminUser(name);
        }else{
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();

        while(true){
            int choice = user.menu();
            user.doOperation(choice,bookList);

        }

    }
}
