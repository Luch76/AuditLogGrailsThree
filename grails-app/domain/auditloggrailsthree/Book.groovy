package auditloggrailsthree

import grails.plugins.orm.auditable.Auditable

class Book implements Auditable {

    Long id;
    String title;
    Collection<Author> authors;

    static constraints = {
        title nullable: true;
    }

    static belongsTo = Author
    static hasMany = [authors: Author]

    /*
    static mapping = {
        authors joinTable: [name: "author_book_matrix", key: 'book_id' ]
    }

     */
}
