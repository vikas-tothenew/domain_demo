package bootcamp

class UtilController {

    def index() {}

    def oneToOne() {
        new Face(nose: new Nose()).save()
//        new Face(nose: Nose.get(1)).save(failOnError: true)
        render "done"
    }

    def deleteWithOneToOne() {
        Face f = Face.get(1L)
        f.delete(failOnError: true, flush: true)
        render "done"
    }

    def oneToMany() {
        new Author(name: "Stephen King")
                .addToBooks(new Book(title: "The Stand"))
                .addToBooks(new Book(title: "The Shining"))
                .save(flush: true)
        render "done"
    }
}