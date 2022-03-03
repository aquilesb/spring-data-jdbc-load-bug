package com.example.springdatajdbcloadbug;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

    @Query(" SELECT address FROM author WHERE id = :authorId")
    Optional<String> findAddress(@Param("authorId") Long authorId);
}
