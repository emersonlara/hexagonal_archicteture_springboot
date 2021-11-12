package com.example.hexagonal.hexagonal.adapters.outbound.database;

import com.example.hexagonal.hexagonal.adapters.outbound.database.entities.BookEntity;
import com.example.hexagonal.hexagonal.domain.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 10/11/2021 23:29
 */

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
