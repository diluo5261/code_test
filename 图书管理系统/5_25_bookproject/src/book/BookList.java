package book;

public class BookList {
    private Book[] bookList = new Book[10];
    private int size;

    public BookList() {
        bookList[0] = new Book("三国演义","罗贯中","小说",89);
        bookList[1] = new Book("西游记","吴承恩","小说",41);
        bookList[2] = new Book("水浒传","施耐庵","小说",59);
        this.size = 3;
    }

    public Book getBook(int pos) {
        return this.bookList[pos];
    }

    public void setBookList(int pos, Book book) {
        this.bookList[pos] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
