public class LibraryBook {
    private String title;
    private boolean checkedOut;
    private int pagesRead;
    private long bookID;

    public LibraryBook(String bookTitle, long id) {
        title = bookTitle;
        checkedOut = false;
        pagesRead = 0;
        bookID = id;
    }

    public void merge(LibraryBook newBook) {
        int thisOGPages = this.pagesRead;
        this.pagesRead += newBook.pagesRead;
        newBook.pagesRead += thisOGPages;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void returnBook() {
        checkedOut = false;
    }

    public void addPagesRead(int pages) {
        pagesRead += pages;
    }

    public long generateFakeISBN(int suffix) {
        // local variable
        long step1 = bookID * 100;

        int firstLetter = title.charAt(0);
        int lastLetter = title.charAt(title.length() - 1);
        int letterSum = firstLetter + lastLetter;

        long step2 = step1 + letterSum;
        long step3 = step2 * 10;
        long fakeISBN = step3 + suffix;

        return fakeISBN;
    }

    public String getTitle() {
        return title;
    }
}