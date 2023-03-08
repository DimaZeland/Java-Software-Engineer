package com.demo.springblog.repository;

import com.demo.springblog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
