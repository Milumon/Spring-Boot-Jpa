package pe.isil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.isil.model.Author;
import pe.isil.model.Book;
import pe.isil.model.Book;
import pe.isil.service.BookService;
import pe.isil.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> findbyall(){
        return bookService.findAll();
    }

    @PostMapping
    @ResponseBody
    public String create(@RequestBody Book book){
        bookService.createOrUpdate(book);
        return "Se registro con exito";
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        bookService.delete(id);
    }

    @GetMapping("/{idAutor}")
    public List<Book> findByIdAutor(@PathVariable int idAutor){
        return bookService.findByIdAutor(idAutor);
    }
}
