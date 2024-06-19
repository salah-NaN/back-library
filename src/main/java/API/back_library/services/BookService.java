package API.back_library.services;

import API.back_library.models.BookModel;
import API.back_library.repositories.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    IBookRepository bookRepository;


    public ArrayList<BookModel> getBooks(){
        return (ArrayList<BookModel>) this.bookRepository.findAll();
    }

    public List<BookModel> getBooksWithAuthorWithRecords(){
        return this.bookRepository.getBooksWithAuthorWithRecords();
    }

    public BookModel createBook(BookModel book){
        return this.bookRepository.save(book);
    }

    public String deleteBook(Long id){

        try{
            this.bookRepository.deleteById(id);
            return "Book deleted";
        } catch (Exception e){
            return "Cannot delete func";
        }
    }
}
