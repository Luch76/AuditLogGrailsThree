package auditloggrailsthree

import grails.plugins.orm.auditable.Auditable

class Book implements Auditable {

    Long id;
    String title;

    static constraints = {
        title nullable: true;
    }

    // static hasMany = [authors: Author]

    static mapping = {
        authors joinTable: [name: "author_book_matrix", key: 'book_id' ]
    }
}
