package models;

public class Book extends Document{
    private String bookName;
    private String authorsName;
    private int numOfPages;
    public Book(){}

    public Book(String manufacturerName, int releaseNum, String bookName, String authorsName, int numOfPages) {
        super(manufacturerName, releaseNum);
        this.bookName = bookName;
        this.authorsName = authorsName;
        this.numOfPages = numOfPages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Book: " + "\n"
                + " Core: " + Book.this.getDCore() + "\n"
                + " Manufacture Name: " + Book.this.getManufacturerName() + "\n"
                + " Release Numbers: " + Book.this.getReleaseNum() + "\n"
                + " Book Name: " + bookName + '\n'
                + " Author's Name: " + authorsName + '\n' +
                " Number Of Pages: " + numOfPages;
    }

    public static void main(String[] args) {
        Book book = new Book("a",1,"abc","ab", 100);
        System.out.println(book);
    }
}
