package com.learning.graphql.bookgraph.queryresolvers;


import com.learning.graphql.bookgraph.data.Author;
import com.learning.graphql.bookgraph.data.Book;
import com.learning.graphql.bookgraph.repository.AuthorRepository;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookAuthorResolver implements GraphQLResolver<Book> {

    @Autowired
    AuthorRepository authorRepository;

    public Author getAuthor(Book book){
        return authorRepository.findAuthorByBookId(book.getId());
    }
}
