public class LibraryBookRunner {
    public static void main(String[] args) {
        int pages = 250;

        LibraryBook book1 = new LibraryBook("Dune", 1);
        LibraryBook book2 = new LibraryBook("Frankenstein", 2);

        int suffix = 1234;

        long isbn = book1.generateFakeISBN(suffix);

        book1.checkOut();
        book1.addPagesRead(pages);

        LibraryBook book3 = book1;

        book1.merge(book2);

        book3.addPagesRead(100);
        book2.checkOut();

        book2 = null;
        book1 = null;
        book1 = book3;

        // NullPointerException
        // book2.checkOut();

        String title = book1.getTitle();
        title = "Hello";
        // title.charAt(7);
        String title2 = title;
        Peek.at(title);
        book1.returnBook();
        title.toUpperCase();
        // NumberFormatExeption
        // Integer.parseInt("hello");
    }
}