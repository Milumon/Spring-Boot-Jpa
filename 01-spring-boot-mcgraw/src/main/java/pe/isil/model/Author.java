package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="authors")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Author {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer authorId;
    private String firstName;
    private String lastName;
    private String biografy;

    // @OneToMany(mappedBy = "author", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // private List<Book> books;

}
