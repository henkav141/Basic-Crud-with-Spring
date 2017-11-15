package com.example.demo.Domain;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
    //Empty interface that extends Spring interface that provides basic repo methods (save, delete etc.)
}
