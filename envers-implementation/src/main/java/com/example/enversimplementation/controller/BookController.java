package com.example.enversimplementation.controller;

import com.example.enversimplementation.entity.Book;
import com.example.enversimplementation.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;



    @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book) {
        return bookService.save(book);
    }


    @PutMapping("/update/{id}/{pages}")
    public String updateBook(@PathVariable Integer id, @PathVariable Integer pages) {
        return bookService.updateBook(id, pages);
    }

    @DeleteMapping("delete/{id}")
    public String deleteBook(@PathVariable Integer id) {
        return bookService.deleteBook(id);
    }


    @GetMapping("/getInfo/{id}")
    public void getInfo(@PathVariable Integer id) {
        bookService.getInfo(id);
    }

}
