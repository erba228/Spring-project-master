package com.example.springproject.Repository;

import com.example.registrationlogindemo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
