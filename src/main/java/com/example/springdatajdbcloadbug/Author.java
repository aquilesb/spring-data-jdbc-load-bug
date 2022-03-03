package com.example.springdatajdbcloadbug;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    private Long id;
    private String name;
    private String address;
}
