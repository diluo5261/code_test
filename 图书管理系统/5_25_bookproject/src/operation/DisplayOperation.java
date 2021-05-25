package operation;

import book.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("DisplayOperation");

        int currentSize = bookList.getSize();

        for (int i = 0; i <currentSize ; i++) {
            System.out.println(bookList.getBook(i));

        }
    }
}
