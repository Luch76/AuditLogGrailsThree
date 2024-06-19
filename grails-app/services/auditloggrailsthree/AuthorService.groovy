package auditloggrailsthree

import grails.gorm.transactions.Transactional

@Transactional
class AuthorService {

    def serviceMethod() {
        Author authorLuch, authorSteve;
        Book book;
        Tag tagScifi, tagFantasy;

        tagScifi = new Tag(tag: "scifi").save(failOnError: true);
        tagFantasy = new Tag(tag: "fantasy").save(failOnError: true);

        authorLuch = new Author(name: "Luch").save(failOnError: true);

        book = new Book(title: "Alpha").save(failOnError: true);
        authorLuch.addToBooks(book);
        book = new Book(title: "Beta").save(failOnError: true);
        authorLuch.addToBooks(book);
        authorLuch.save(failOnError: true);
        book = new Book(title: "Gamma").save(failOnError: true);

        /*
        book = new Book(title: "Beta").save(failOnError: true);
        authorLuch.books.add(book);
        authorLuch.save(failOnError: true);
        */


        /*

        for (Integer booksIndex = (authorLuch?.books?.size() ?: 0) - 1; booksIndex >= 0; booksIndex--) {
            authorLuch.books[booksIndex].delete();
            authorLuch.books.remove(booksIndex);
        }
        authorLuch.delete();

         */
        
        // authorLuch.delete();

    }
}
