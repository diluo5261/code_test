import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {

    public static User login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("please input name:>");
        String name = scan.nextLine();
        System.out.println("please input identity: 1-> Admin 2-> Normal :>");
        int choice = scan.nextInt();

        if (choice == 1){
            return new AdminUser(name);
        }else{
            return new NormalUser(name);
        }

    }

    public static void main(String[] args) {
        BookList books = new BookList();

        User user = login();
        while(true){

            user.doOperation(user.menu(),books);

        }

    }
}
