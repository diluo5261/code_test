package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class SearchOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("search operation");

        Scanner scan = new Scanner(System.in);
        System.out.println("input book name:>");
        String name = scan.nextLine();

        int currentSize = bookList.getSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (name.equals(book.getName())){
                System.out.println("find the book");
                System.out.println(book);
                return;
            }
        }
        System.out.println("not find the book");
    }
}
