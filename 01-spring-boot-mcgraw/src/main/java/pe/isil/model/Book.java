package pe.isil.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="books")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer isbn;
    private Integer authorId;
    private String title;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate publicationDate;
    private Integer numberOfPages;
    private Double price;

    /*@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", insertable = false, updatable = false)
    private Author author;*/


}
