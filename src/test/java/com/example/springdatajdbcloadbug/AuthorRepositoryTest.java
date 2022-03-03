package com.example.springdatajdbcloadbug;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@DataJdbcTest
@ActiveProfiles("test")
class AuthorRepositoryTest {

    @Autowired
    private AuthorRepository authorRepository;

    /**
     * This test works in the version 2.5.10 it has stopped working from the 2.6.0
     */
    @Test
    void findAddress_shouldReturnEmpty_whenAddressIsNull(){
        final var result = authorRepository.findAddress(1L);
        assertThat(result).isEmpty();
    }

    @Test
    void findAddress_shouldReturnValue_whenAddressIsNotNull(){
        final var result = authorRepository.findAddress(2L);
        assertThat(result).isNotEmpty();
    }
}