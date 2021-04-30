package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Author;
import pe.isil.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;


    public void createOrUpdate(Author author){
        System.out.println("GAAAAAAAAAAAAAAAAA" + author);
        authorRepository.save(author);
    }

    public void delete(Integer authorId){
        authorRepository.deleteById(authorId);
    }

    public Author findById(Integer id){
        return authorRepository.findById(id).orElse(null);
    }

    public List<Author> findAll(){
        return authorRepository.findAll();
    }

}
