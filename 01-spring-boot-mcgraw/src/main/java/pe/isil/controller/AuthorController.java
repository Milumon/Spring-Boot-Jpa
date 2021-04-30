package pe.isil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.isil.model.Author;
import pe.isil.model.Book;
import pe.isil.service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> findbyall(){
        return authorService.findAll();
    }

    @PostMapping
    @ResponseBody
    public String create(@RequestBody Author author){
        authorService.createOrUpdate(author);
        return "Se registro con exito";
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        authorService.delete(id);
    }


}
