package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class SearchOperation implements IOperation{
    @Override
    public void work(BookList books) {
        System.out.println("search book!");
        Scanner scan = new Scanner(System.in);
        System.out.println("input your find name:");
        String name = scan.nextLine();

        for (int i = 0; i <books.getUsedSize() ; i++) {
            Book book = books.getBook(i);
            if (name.equals(book.getName())){
                System.out.println("find it");
                System.out.println(book);
                return;
            }
        }
        System.out.println("not find");
    }
}
