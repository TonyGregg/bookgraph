package com.learning.graphql.bookgraph.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/** Created on Sat, 3/5/22 at 12:59 PM by Genil. */
@Data
@Entity
@Table(name = "Author", schema = "BOOK_API_DATA")
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer id;

  @Column(name = "firstname")
  String firstName;

  @Column(name = "lastname")
  String lastName;

  @Column(name = "bookid")
  Integer bookId;
}
