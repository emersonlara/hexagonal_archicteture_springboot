package com.example.hexagonal.hexagonal.adapters.dtos.book;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 11/11/2021 21:51
 */

@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties
public class BookInput {

  @NotNull
  @NotBlank
  private String title;
  @NotNull
  @NotBlank
  private String edition;
  @NotNull
  @NotBlank
  private String publishingCompany;
  @NotNull
  @NotBlank
  private String author;
  @NotNull
  @NotBlank
  private String category;

}
