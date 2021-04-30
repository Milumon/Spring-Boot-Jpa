package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.isil.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {



}
