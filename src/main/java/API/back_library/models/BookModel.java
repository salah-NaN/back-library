package API.back_library.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class BookModel {

    // variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer year;

    @Column
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
//    @JsonIgnore
    private AuthorModel author;

    @OneToMany(mappedBy = "book")
    @Column
//    @JsonIgnore

    private List<BorrowRecordModel> borrowRecordBooks;

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public AuthorModel getAuthor() {
        return author;
    }

    public void setAuthor(AuthorModel author) {
        this.author = author;
    }

    public List<BorrowRecordModel> getBorrowRecordBooks() {
        return borrowRecordBooks;
    }

    public void setBorrowRecordBooks(List<BorrowRecordModel> borrowRecordBooks) {
        this.borrowRecordBooks = borrowRecordBooks;
    }

}
