package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList books) {
        System.out.println("delete book");
        Scanner scan = new Scanner(System.in);
        System.out.println("input your delete book name:");
        String name = scan.nextLine();
        int current = books.getUsedSize();

        int index = -1;
        for (int i = 0; i <current ; i++) {
            Book book = books.getBook(i);
            if (name.equals(book.getName())){
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("not find!");
            return;
        }

        for (int i = index; i <current-1 ; i++) {
            Book book = books.getBook(i);
            books.setBooks(i,book);
        }

        books.setBooks(current-1,null);
        books.setUsedSize(current-1);
        System.out.println("delete success!");

    }
}
