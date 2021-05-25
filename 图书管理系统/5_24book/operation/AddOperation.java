package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList books) {
        Scanner scan = new Scanner(System.in);
        System.out.println("add book!");
        System.out.println("input name:");
        String name = scan.nextLine();
        System.out.println("input author");
        String author = scan.nextLine();
        System.out.println("input book type");
        String type = scan.nextLine();
        System.out.println("input price");
        int price = scan.nextInt();

        int current = books.getUsedSize();
        for (int i = 0; i <current ; i++) {
            Book book = books.getBook(i);
            if (name.equals(book.getName())){
                System.out.println("do not add again");
                return;
            }
        }
        Book book = new Book(name,author,59,type);
        books.setBooks(current,book);
        books.setUsedSize(current+1);
        System.out.println("add book success");

    }
}
