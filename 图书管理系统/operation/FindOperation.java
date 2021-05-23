package 图书管理系统.operation;

import 图书管理系统.book.Book;
import 图书管理系统.book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("查找图书");
        Scanner scan = new Scanner(System.in);
        System.out.println("输入要查找的书名:");
        String bookName = scan.nextLine();
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            Book book = bookList.getBook(i);
            if (bookName.equals(bookList.getBook(i).getName())){
                System.out.println("找到此书如下:");
                System.out.println(book);
                return;
            }

        }
        System.out.println("没有这本书");
    }
}
