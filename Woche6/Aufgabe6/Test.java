public class Test {

    public static void main(String[] args) {
        Book book1 = new Book("spannender Titel", "Peter Parker", 1999);
        Book book2 = new Book("Moby Dick", "Pepe Melville", 1851);
        Book[] books = {};
        Bookshelf bookshelf = new Bookshelf(books);
        
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.printBooks();
    }
}
