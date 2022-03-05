package com.learning.graphql.bookgraph.queryresolvers;



import com.learning.graphql.bookgraph.data.Author;
import com.learning.graphql.bookgraph.data.Book;
import com.learning.graphql.bookgraph.repository.AuthorRepository;
import com.learning.graphql.bookgraph.repository.BookRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookQuery implements GraphQLQueryResolver{

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    public Iterable<Book> allBook(){
        return bookRepository.findAll();
    }

    public Book getBookByName(String name){
        return bookRepository.findBookByName(name);
    }

    public Iterable<Author> allAuthor(){
        return authorRepository.findAll();
    }

}
