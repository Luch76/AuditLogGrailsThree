package auditloggrailsthree

import grails.plugins.orm.auditable.Auditable

class Book implements Auditable {

    String title;
    Collection<Author> authors;
    // Collection<Tag> tags;

    static belongsTo = Author;
    static hasMany = [authors: Author];

    static mapping = {
        authors joinTable: [name: "authors_books", key: 'book_id' ]
    }

}
