package com.asrihashim.boot_graphql;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("BOOK")
public record Book (
    @Id 
    Long id,
    String title,
    String author
){

}
