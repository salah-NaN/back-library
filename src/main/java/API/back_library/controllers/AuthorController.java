package API.back_library.controllers;

import API.back_library.models.AuthorModel;
import API.back_library.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/author")
public class AuthorController {

    @Autowired(required = false)
    AuthorService authorService;

    @GetMapping
    public List<AuthorModel> getAllAuthors(){
        return this.authorService.getAllAuthors();
    }

    @GetMapping(path = "/{id}")
    public AuthorModel getAuthorWithBooksWithRecords(@PathVariable("id") Long id){
        return this.authorService.getAuthorWithBooksWithRecords(id);
    }

    @PostMapping
    public AuthorModel createAuthor(@RequestBody AuthorModel author) {
        return this.authorService.createAuthor(author);
    }


}
