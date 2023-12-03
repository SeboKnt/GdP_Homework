public class Bookshelf {

    Book[] books = {};

    public Bookshelf(Book[] b){
        this.books = b;
    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            books[i].printInfo();
        }
    }

    public boolean containsBook(String title){
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equalsIgnoreCase(title)){
                return true;
            }
        }
        return false;
    }

    public boolean addBook(Book book) {
        if (containsBook(book.title)) {
            return false;
        } else {
            Book[] newBooks = new Book[books.length + 1];
            System.arraycopy(books, 0, newBooks, 0, books.length);
            newBooks[newBooks.length - 1] = book;
            books = newBooks;
            return true;
        }
    }
}

