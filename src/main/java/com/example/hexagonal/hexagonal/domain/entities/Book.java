package com.example.hexagonal.hexagonal.domain.entities;

import com.example.hexagonal.hexagonal.adapters.outbound.database.entities.AuthorEntity;

import java.util.List;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 10/11/2021 21:38
 */

public class Book {

  private Long id;
  private String title;
  private String edition;
  private String publishingCompany;
  private Author author;
  private Category category;

  public Book() {
  }

  public Book(Long id, String title, String edition,
              String publishingCompany, Author author, Category category) {
    this.id = id;
    this.title = title;
    this.edition = edition;
    this.publishingCompany = publishingCompany;
    this.author = author;
    this.category = category;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }

  public String getPublishingCompany() {
    return publishingCompany;
  }

  public void setPublishingCompany(String publishingCompany) {
    this.publishingCompany = publishingCompany;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
