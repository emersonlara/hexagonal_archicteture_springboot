package com.example.hexagonal.hexagonal.adapters.outbound.database;

import com.example.hexagonal.hexagonal.adapters.outbound.database.entities.BookEntity;
import com.example.hexagonal.hexagonal.domain.entities.Book;
import com.example.hexagonal.hexagonal.domain.ports.BookRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 10/11/2021 23:24
 */

@Component
@Primary
public class BookRepositoryImpl implements BookRepositoryPort {

  @Autowired
  private BookRepository bookRepository;
  @Autowired
  private ModelMapper modelMapper;

  @Override
  public Book save(Book book) {
    BookEntity bookEntity = modelMapper.map(book, BookEntity.class);
    return modelMapper.map(bookRepository.save(bookEntity), Book.class);
  }

  @Override
  public List<Book> findAll() {
    return bookRepository.findAll().stream().map( bookEntity -> {
       return modelMapper.map(bookEntity, Book.class);
    }).collect(Collectors.toList());
  }

  @Override
  public Optional<Book> findById(Long id) {
    BookEntity bookEntity = bookRepository.findById(id).get();
    return Optional.of(modelMapper.map(bookEntity, Book.class));
  }
}
