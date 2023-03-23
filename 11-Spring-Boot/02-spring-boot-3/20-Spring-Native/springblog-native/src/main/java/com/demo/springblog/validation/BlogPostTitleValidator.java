package com.demo.springblog.validation;

import com.demo.springblog.domain.Post;
import com.demo.springblog.service.PostService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.thymeleaf.util.StringUtils;

public record BlogPostTitleValidator(
        PostService postService) implements ConstraintValidator<BlogPostTitleAlreadyExists, Post> {

    @Override
    public void initialize(BlogPostTitleAlreadyExists constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Post post, ConstraintValidatorContext constraintValidatorContext) {
        if (!StringUtils.isEmpty(post.getTitle()) && postService.postExistsWithTitle(post.getTitle())) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate("{TitleAlreadyExists}")
                    .addPropertyNode("title")
                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}
