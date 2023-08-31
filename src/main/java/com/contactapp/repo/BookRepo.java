package com.contactapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactapp.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>{

}
