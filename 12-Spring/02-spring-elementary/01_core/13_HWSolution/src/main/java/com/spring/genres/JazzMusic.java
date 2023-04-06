package com.spring.genres;

import com.spring.Music;


public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Take five";
    }
}
