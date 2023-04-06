package com.spring.genres;

import com.spring.Music;


public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
