package 图书管理系统.user;

import 图书管理系统.book.BookList;
import 图书管理系统.operation.IOperation;

public abstract class User {
    protected String name;
    protected IOperation[] iOperations;

    public User(String name){
        this.name = name;
    }

    public abstract int menu();

    public abstract void doOperation(int choice, BookList bookList);
}
