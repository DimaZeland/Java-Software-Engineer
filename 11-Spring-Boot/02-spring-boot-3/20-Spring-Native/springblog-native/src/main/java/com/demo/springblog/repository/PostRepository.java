package com.demo.springblog.repository;

import com.demo.springblog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

    boolean existsByTitle(String title);
}
