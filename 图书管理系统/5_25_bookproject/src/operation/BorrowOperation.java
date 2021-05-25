package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("BorrowOperation");
        Scanner scan = new Scanner(System.in);
        System.out.println("input your borrow book");
        String name = scan.nextLine();

        int currentSzie = bookList.getSize();
        for (int i = 0; i <currentSzie ; i++) {
            Book book = bookList.getBook(i);
            if (name.equals(book.getName()) && !book.isBorrowed()){
                book.setBorrowed(true);
                System.out.println("borrow successful!");
                return;
            }
        }
        System.out.println("borrow failed!");
    }
}
