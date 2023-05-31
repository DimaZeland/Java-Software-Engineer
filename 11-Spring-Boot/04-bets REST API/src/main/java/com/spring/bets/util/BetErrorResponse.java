package com.spring.bets.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BetErrorResponse
{
    private String message;
    private long timestamp;
}
