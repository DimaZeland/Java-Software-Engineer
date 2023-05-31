package com.spring.bets.util;

public class CarNotFoundException extends RuntimeException
{
    public CarNotFoundException(String message)
    {
        super(message);
    }
}
