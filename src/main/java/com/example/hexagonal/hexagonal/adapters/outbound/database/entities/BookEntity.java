package com.example.hexagonal.hexagonal.adapters.outbound.database.entities;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 10/11/2021 23:42
 */
@Data
@Entity
@Table(name = "book")
public class BookEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private String edition;
  private String publishingCompany;
  @OneToOne(cascade=CascadeType.PERSIST)
  private AuthorEntity author;
  @OneToOne(cascade=CascadeType.PERSIST)
  private CategoryEntity category;

}
