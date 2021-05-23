package 图书管理系统.operation;

import 图书管理系统.book.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出图书系统");
        System.exit(0);
    }
}
