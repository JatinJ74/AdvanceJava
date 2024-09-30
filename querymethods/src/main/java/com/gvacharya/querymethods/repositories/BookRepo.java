package com.gvacharya.querymethods.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.gvacharya.querymethods.entities.Book;
import com.gvacharya.querymethods.entities.BookT;


public interface BookRepo extends JpaRepository<BookT, Integer>{

}
