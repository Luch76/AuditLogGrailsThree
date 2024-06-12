package auditloggrailsthree

class AuthorController {
    AuthorService authorService;

    def index() {
        authorService.serviceMethod();
        render "OK";
    }
}
