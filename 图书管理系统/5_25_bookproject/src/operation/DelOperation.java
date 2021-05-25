package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("DelOperation");
        Scanner scan = new Scanner(System.in);
        System.out.println("input dele book name:");
        String name = scan.nextLine();

        int currentSize = bookList.getSize();
        int index = -1;
        for (int i = 0; i <currentSize ; i++) {
            Book book = bookList.getBook(i);
            if (name.equals(book.getName())){
                index = i;
            }
        }

        if (-1 == index) {
            System.out.println("not the book");
            return;
        }

        for (int i = index; i <currentSize-1 ; i++) {
            Book book = bookList.getBook(i+1);
            bookList.setBookList(i,book);
        }

        bookList.setBookList(currentSize,null);
        bookList.setSize(currentSize-1);
        System.out.println("delete successful");
    }
}
