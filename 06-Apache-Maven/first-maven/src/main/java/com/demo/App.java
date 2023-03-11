package com.demo;

import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Supplier<String> s = ()-> "HelloWorld";
        System.out.println( s.get());
    }
}
