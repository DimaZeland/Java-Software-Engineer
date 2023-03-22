package com.demo.http.servlets.starter.mapper;

public interface Mapper<F, T> {
    T mapFrom(F object);
}
