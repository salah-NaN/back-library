package API.back_library.repositories;

import API.back_library.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IBookRepository extends JpaRepository<BookModel, Long> {

    @Query ("SELECT b FROM BookModel b join fetch b.author join fetch b.borrowRecordBooks")
    List<BookModel> getBooksWithAuthorWithRecords();
}
