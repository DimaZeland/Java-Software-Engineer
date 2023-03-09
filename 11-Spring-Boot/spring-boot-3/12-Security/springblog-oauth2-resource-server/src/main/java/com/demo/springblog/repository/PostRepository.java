package com.demo.springblog.repository;

import com.demo.springblog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {


    boolean existsByTitle(String title);

    Optional<Post> findBySlug(String slug);
}
