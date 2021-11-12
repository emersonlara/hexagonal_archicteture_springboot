package com.example.hexagonal.hexagonal.domain.entities;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 10/11/2021 21:42
 */

public class Author {

  private Long id;
  private String author;

  public Author() {
  }

  public Author(Long id, String author) {
    this.id = id;
    this.author = author;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
