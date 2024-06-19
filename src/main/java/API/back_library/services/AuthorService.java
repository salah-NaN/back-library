package API.back_library.services;
import API.back_library.models.AuthorModel;
import API.back_library.repositories.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    IAuthorRepository authorRepository;

    public AuthorModel getAuthorWithBooksWithRecords(Long id){
        return this.authorRepository.getAuthorWithBooksWithRecords(id);
    }

    public List<AuthorModel> getAllAuthors(){
        return this.authorRepository.findAll();
    }

    public AuthorModel createAuthor(AuthorModel author){
        return this.authorRepository.save(author);
    }
}