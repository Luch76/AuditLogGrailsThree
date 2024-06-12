package auditloggrailsthree

import grails.plugins.orm.auditable.Auditable

class Author implements Auditable {
    Long id;
    String name;
    List<Book> books;

    static constraints = {
        name nullable: true;
    }

    static hasMany = [books: Book];

    /*
    static mapping = {
        books joinTable: [name: "author_book_matrix", key: 'author_id']
    }'

     */

}
