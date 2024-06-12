package auditloggrailsthree

import grails.gorm.transactions.Transactional

@Transactional
class AuthorService {

    def serviceMethod() {
        Author authorLuch, authorSteve;
        Book book;

        authorLuch = new Author(name: "Luch");
        //authorSteve = new Author(name: "Luch");

        book = new Book(title: "Alpha");
        authorLuch.addToBooks(book);
        //authorSteve.addToBooks(book);
        book = new Book(title: "Beta");
        authorLuch.addToBooks(book);
        //authorSteve.addToBooks(book);

        authorLuch.save(failOnError: true);
        //authorSteve.save(failOnError: true);

        //book = new Book(title: "Indie");
        //book.save(failOnError: true);

        /*
        for (Integer booksIndex = (authorLuch?.books?.size() ?: 0) - 1; booksIndex >= 0; booksIndex--) {
            authorLuch.books[booksIndex].delete();
            authorLuch.books.remove(booksIndex);
        }
        authorLuch.delete();
        */
    }
}
