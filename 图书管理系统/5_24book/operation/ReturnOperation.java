package operation;

import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList books) {
        System.out.println("return book!");
        Scanner scan = new Scanner(System.in);
        System.out.println("input your return name:");
        String name = scan.nextLine();

        for (int i = 0; i <books.getUsedSize() ; i++) {
            if (name.equals(books.getBook(i).getName()) && books.getBook(i).isBorrowed()){
                books.getBook(i).setBorrowed(false);
                System.out.println("return success ");
                return;
            }
        }

        System.out.println("return failed");
    }
}
