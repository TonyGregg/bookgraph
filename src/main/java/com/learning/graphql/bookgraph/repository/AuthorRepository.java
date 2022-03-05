package com.learning.graphql.bookgraph.repository;

import com.learning.graphql.bookgraph.data.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

    Author findAuthorByBookId(Integer bookId);
}