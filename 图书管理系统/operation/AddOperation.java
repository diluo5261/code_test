package 图书管理系统.operation;

import 图书管理系统.book.Book;
import 图书管理系统.book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("新增图书");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入图书的名字:");
        String name = scan.nextLine();
        System.out.println("请输入图书的作者:");
        String author = scan.nextLine();
        System.out.println("请输入图书的类型:");
        String type = scan.nextLine();
        System.out.println("请输入图书的价格:");
        int price = scan.nextInt();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i <currentSize ; i++) {
            Book book = bookList.getBook(i);
            if (name.equals(book.getName())){
                System.out.println("书架存在这本书,不能重复添加!");
                return;
            }
        }

        Book book = new Book(name,author,price,type);
        bookList.setBooks(currentSize,book);
        bookList.setUsedSize(currentSize+1);
        System.out.println("添加成功!");
    }

}
