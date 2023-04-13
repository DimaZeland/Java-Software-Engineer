package com.spring.SpringBoot_Library_App.repositories;

import com.spring.SpringBoot_Library_App.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleStartingWith(String title);
}
