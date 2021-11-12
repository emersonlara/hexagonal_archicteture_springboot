package com.example.hexagonal.hexagonal.adapters.inbound.controllers;

import com.example.hexagonal.hexagonal.adapters.dtos.book.BookInput;
import com.example.hexagonal.hexagonal.domain.entities.Book;
import com.example.hexagonal.hexagonal.domain.ports.BookServicePort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 10/11/2021 23:06
 */

@RestController
@RequestMapping(value = "/book")
public class BookController {

  @Autowired
  private BookServicePort bookServicePort;
  @Autowired
  private ModelMapper modelMapper;

  @PostMapping
  public ResponseEntity create(@Valid BookInput input) {
    Book book = modelMapper.map(input, Book.class);
    bookServicePort.save(book);
    return ResponseEntity.status(201).build();
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity read( @PathVariable Long id) {
    Book book = bookServicePort.findById(id).get();
    return ResponseEntity.ok(book);
  }

}
