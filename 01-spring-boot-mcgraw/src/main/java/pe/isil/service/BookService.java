package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Book;
import pe.isil.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void createOrUpdate(Book book){
        bookRepository.save(book);
    }

    public void delete(Integer id){
        bookRepository.deleteById(id);
    }

    public Book findById(Integer id){
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }


    public List<Book> findByIdAutor (int authorId){
        return bookRepository.findByIdAutor(authorId);
    }
}
