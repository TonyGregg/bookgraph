package com.learning.graphql.bookgraph.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 * Created on Sat, 3/5/22 at 12:59 PM by Genil.
 */
@Entity
@Data
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String name;
  @Column(name = "pagecount")
  private String pageCount;
}
