package com.horstmann.greet.com.horstmann.greet.internal;

import com.horstmann.greet.com.horstmann.greet.Greeter;

public class GreeterImpl implements Greeter
{
   public String greet(String subject)
   {
      return "Hello, " + subject + "!";
   }
}
