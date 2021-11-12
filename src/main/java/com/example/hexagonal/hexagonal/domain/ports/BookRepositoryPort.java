package com.example.hexagonal.hexagonal.domain.ports;

import com.example.hexagonal.hexagonal.domain.entities.Book;

import java.util.List;
import java.util.Optional;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 10/11/2021 22:01
 */

public interface BookRepositoryPort {

  Book save(Book book);
  List<Book> findAll();
  Optional<Book> findById(Long id);

}
