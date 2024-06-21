package auditloggrailsthree

import grails.converters.JSON

class AuthorController {
    AuthorService authorService;

    def getAircraft() {
        Aircraft aircraft = authorService.getAircraft();
        render aircraft as JSON;
    }

    def index() {
        authorService.serviceMethod();
        render "OK";
    }

    def aircraft() {
        authorService.aircraft();
        render "OK";
    }
}
