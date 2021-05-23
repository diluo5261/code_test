package 图书管理系统.operation;

import 图书管理系统.book.Book;
import 图书管理系统.book.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显式图书信息");
        for (int i = 0; i <bookList.getUsedSize() ;i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
        System.out.println("显式结束!");
    }
}
