package API.back_library.controllers;

import API.back_library.models.AuthorModel;
import API.back_library.models.BookModel;
import API.back_library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    @Autowired(required = false)
    BookService bookService;

    @GetMapping
    public ArrayList<BookModel> getBooks(){
        return this.bookService.getBooks();
    }

    @GetMapping("/booksWithAuthor")
    public List<BookModel> getBooksWithAuthorWithRecords(){
        return this.bookService.getBooksWithAuthorWithRecords();
    }

    @PostMapping
    public BookModel createBook(@RequestBody BookModel book){
        return this.bookService.createBook(book);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteBook(@PathVariable("id") Long id){
        return this.bookService.deleteBook(id);
    }
}
