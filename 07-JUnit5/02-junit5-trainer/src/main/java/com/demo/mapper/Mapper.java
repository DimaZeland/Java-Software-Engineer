package com.demo.mapper;

public interface Mapper<F, T> {

    T map(F object);
}
