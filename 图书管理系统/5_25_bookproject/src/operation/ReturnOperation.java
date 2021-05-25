package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("return operation");
        Scanner scan = new Scanner(System.in);
        System.out.println("input your return name:");
        String name = scan.nextLine();

        int currentSize = bookList.getSize();

        for (int i = 0; i <currentSize ; i++) {
            Book book = bookList.getBook(i);
            if (name.equals(book.getName()) && book.isBorrowed()){
                book.setBorrowed(false);
                System.out.println("return successful");
                return;
            }
        }
        System.out.println("return failed!");

    }
}
