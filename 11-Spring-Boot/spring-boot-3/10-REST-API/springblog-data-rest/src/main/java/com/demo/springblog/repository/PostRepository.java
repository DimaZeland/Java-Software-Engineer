package com.demo.springblog.repository;

import com.demo.springblog.domain.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {


    boolean existsByTitle(String title);

    Optional<Post> findBySlug(String slug);
}
