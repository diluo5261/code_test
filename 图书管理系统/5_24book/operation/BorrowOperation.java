package operation;

import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList books) {
        System.out.println("borrow book");
        Scanner scan = new Scanner(System.in);
        System.out.println("input your borrow book:");
        String name = scan.nextLine();

        for (int i = 0; i <books.getUsedSize() ; i++) {
            if (name.equals(books.getBook(i).getName()) && !books.getBook(i).isBorrowed()){
                books.getBook(i).setBorrowed(true);
                System.out.println("borrow success");
                return;
            }
        }

        System.out.println("not find this book");
    }
}
