package com.example.hexagonal.hexagonal.adapters.outbound.database.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 10/11/2021 23:45
 */

@Data
@Entity
@Table(name = "category")
public class CategoryEntity implements Serializable  {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String category;

}
