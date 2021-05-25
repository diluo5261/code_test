package user;

import book.BookList;
import operation.ExitOperation;
import operation.IOperation;

public abstract class User {
    protected String name;

    protected IOperation[] iOperations;


    public User(String name) {
        this.name = name;

    }

    public abstract int menu();
    public void doOperation(int choice, BookList books){
        this.iOperations[choice].work(books);
    }


}
