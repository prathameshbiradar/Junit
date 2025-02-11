package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ServiceTest {
    @Test
    public void Test()
    {
        Service ser = new Service();
        String sum =ser.getName(-1);
        System.out.println("The answer is: "+sum);
        Assertions.assertEquals("a",sum);
    }
  
}