package com.example.hexagonal.hexagonal.domain.service;

import com.example.hexagonal.hexagonal.domain.entities.Book;
import com.example.hexagonal.hexagonal.domain.ports.BookRepositoryPort;
import com.example.hexagonal.hexagonal.domain.ports.BookServicePort;

import java.util.List;
import java.util.Optional;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 10/11/2021 22:12
 */

public class BookServiceImp implements BookServicePort {

  private BookRepositoryPort bookRepositoryPort;

  public BookServiceImp(BookRepositoryPort bookRepositoryPort) {
    this.bookRepositoryPort = bookRepositoryPort;
  }

  @Override
  public Book save(Book book) {
    return bookRepositoryPort.save(book);
  }

  @Override
  public List<Book> findAll() {
    return bookRepositoryPort.findAll();
  }

  @Override
  public Optional<Book> findById(Long id) {
    return bookRepositoryPort.findById(id);
  }
}
