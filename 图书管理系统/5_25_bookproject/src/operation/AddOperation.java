package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("AddOperation");

        Scanner scan = new Scanner(System.in);
        System.out.println("input book name:");
        String name = scan.nextLine();
        System.out.println("input book author:");
        String author = scan.nextLine();
        System.out.println("input book type:");
        String type = scan.nextLine();
        System.out.println("input price");
        int price = scan.nextInt();

        int currentSize = bookList.getSize();
        for (int i = 0; i <currentSize ; i++) {
            Book book = bookList.getBook(i);
            if (name.equals(book.getName())){
                System.out.println("the book already ,not add again!");
                return;
            }
        }
        Book book = new Book(name,author,type,price);
        bookList.setBookList(currentSize,book);
        bookList.setSize(currentSize+1);
        System.out.println("add successful");
    }


}
