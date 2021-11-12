package com.example.hexagonal.hexagonal.adapters.configuration;

import com.example.hexagonal.hexagonal.HexagonalApplication;
import com.example.hexagonal.hexagonal.adapters.outbound.database.BookRepositoryImpl;
import com.example.hexagonal.hexagonal.domain.ports.BookRepositoryPort;
import com.example.hexagonal.hexagonal.domain.ports.BookServicePort;
import com.example.hexagonal.hexagonal.domain.service.BookServiceImp;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 10/11/2021 23:14
 */

@Configuration
public class BeanConfiguration {

  @Bean
  BookServiceImp instance(BookRepositoryPort bookRepositoryPort) {
    return new BookServiceImp(bookRepositoryPort);
  }

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

}
