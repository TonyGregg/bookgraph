package com.learning.graphql.bookgraph.repository;

import com.learning.graphql.bookgraph.data.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

    Book findBookByName(String name);
}
