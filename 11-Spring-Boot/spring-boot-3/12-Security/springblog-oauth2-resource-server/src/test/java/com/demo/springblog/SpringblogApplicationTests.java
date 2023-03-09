package com.demo.springblog;

import com.demo.springblog.domain.Post;
import com.demo.springblog.repository.PostRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@DataJpaTest
@Import({PostRepository.class})
@Disabled
class SpringblogApplicationTests {

    @Autowired
    private PostRepository postRepository;

    @Test
    void test() {
        Post post = new Post();
        post.setTitle("test");
        post.setDescription("test");
        postRepository.save(post);

        Assertions.assertTrue(postRepository.existsByTitle("test"));
    }

}
