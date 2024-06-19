package auditloggrailsthree

import grails.plugins.orm.auditable.Auditable

class Author implements Auditable {
    Long id;
    String name;
    Collection<Book> books;
    //Collection<Tag> tags;

    static hasMany = [books: Book];

    static mapping = {
        books joinTable: [name: "authors_books", key: 'author_id']
    }

}
