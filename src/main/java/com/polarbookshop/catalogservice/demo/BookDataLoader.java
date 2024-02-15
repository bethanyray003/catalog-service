package com.polarbookshop.catalogservice.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.polarbookshop.catalogservice.domain.Book;
import com.polarbookshop.catalogservice.domain.BookRepository;

import java.util.List;

@Component
@Profile("testdata")
public class BookDataLoader {
    private final BookRepository repository;

    public BookDataLoader(BookRepository repository){
        this.repository = repository;
    }

    @SuppressWarnings("null")
    public void loadBookTestData(){

        repository.deleteAll();

        var book1 = Book.of("1234567890", "Northern Lights", "Lyra Silverstar", 99.99);
        var book2 = Book.of("1234567892", "Polar Journey", "Iorek Polarson", 12.90);

        repository.saveAll(List.of(book1, book2));
        
    }
}
