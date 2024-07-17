package com.kapasiya.bootrestbookapplication.repo;

import com.kapasiya.bootrestbookapplication.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer>
{

}
