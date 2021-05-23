package 图书管理系统.operation;

import 图书管理系统.book.Book;
import 图书管理系统.book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.println("请输入你要归还图书的名字:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i <currentSize ; i++) {
            Book book = bookList.getBook(i);
            if (name.equals(book.getName())){
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("借阅失败!");

    }
}
