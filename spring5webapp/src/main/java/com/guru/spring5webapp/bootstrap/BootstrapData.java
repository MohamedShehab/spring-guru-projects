package com.guru.spring5webapp.bootstrap;

import com.guru.spring5webapp.domain.Author;
import com.guru.spring5webapp.domain.Book;
import com.guru.spring5webapp.domain.Publisher;
import com.guru.spring5webapp.repositories.AuthorRepository;
import com.guru.spring5webapp.repositories.BookRepository;
import com.guru.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository ,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author author = new Author("Mohamed", "Ahmed");
        Book book = new Book("Java", "123456");
        author.getBooks().add(book);
        book.getAuthors().add(author);
        authorRepository.save(author);
        bookRepository.save(book);

        Publisher publisher = new Publisher();
        publisher.setState("Flb");
        publisher.setName("Publisher");
        publisher.setCity("Cairo");
        publisherRepository.save(publisher);

        Book book1 = new Book("Java", "123456");
        book1.setPublisher(publisher);
        book1.getAuthors().add(author);
        bookRepository.save(book1);
    }
}
