package com.demo.springblog.validation;

import com.demo.springblog.dto.PostDto;
import com.demo.springblog.service.PostService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.thymeleaf.util.StringUtils;

public record BlogPostTitleValidator(
        PostService postService) implements ConstraintValidator<BlogPostTitleAlreadyExists, PostDto> {

    @Override
    public void initialize(BlogPostTitleAlreadyExists constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(PostDto post, ConstraintValidatorContext constraintValidatorContext) {
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
