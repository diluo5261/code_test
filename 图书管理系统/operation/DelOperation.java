package 图书管理系统.operation;

import 图书管理系统.book.Book;
import 图书管理系统.book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要删除书的名字:");
        String name = scan.nextLine();

        int currentSize = bookList.getUsedSize();
        int index = -1;
        for (int i = 0; i <currentSize ; i++) {
            Book book = bookList.getBook(i);
            if(name.equals(book.getName())){
                index = i;
            }
        }

        if (-1 == index ){
            System.out.println("没有这本书!");
            return;
        }

        for (int i = index; i <currentSize-1 ; i++) {
            Book book = bookList.getBook(i+1);
            bookList.setBooks(i,book);
        }

        //防止内存泄漏
        bookList.setBooks(currentSize-1,null);
        bookList.setUsedSize(currentSize-1);
    }
}
