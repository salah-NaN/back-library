package API.back_library.repositories;

import API.back_library.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IAuthorRepository extends JpaRepository<AuthorModel, Long> {

    //@Query("SELECT DISTINCT a FROM AuthorModel a JOIN FETCH a.books b JOIN FETCH b.borrowRecordBooks WHERE a.id = :author_id")
    @Query("SELECT DISTINCT a FROM AuthorModel a JOIN FETCH a.books  JOIN a.books.borrowRecordBooks WHERE a.id = :author_id")
    AuthorModel getAuthorWithBooksWithRecords(@Param("author_id") Long id);
}

