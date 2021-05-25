package operation;

import book.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList books) {
        System.out.println("display book");
        for (int i = 0; i <books.getUsedSize() ; i++) {
            System.out.println(books.getBook(i));

        }
    }
}
