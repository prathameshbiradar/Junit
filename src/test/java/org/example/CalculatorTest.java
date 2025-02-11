package org.example;

import org.junit.jupiter.api.*;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class CalculatorTest {
   Calculator cal;
   @BeforeAll // Indicate that annoted method should be executed before all test cases in test class.
   static void beforeAllTest()
   {
       System.out.println("This needs to run before all");
   }
   @BeforeEach // indicate that annoted method should be executed before each test.
   void init()
   {
       cal = new Calculator();
   }
   @AfterEach //indicate that annoted method should be executed after Each test case.
   void cleanUp()
   {
       System.out.println("Cleaning up..");
   }
   @Nested
   class AddTest
   {
       @Test
       @DisplayName("This is add method")// mark the method as test related method.
       public void test()
       {

           int expected = 8;
           int actual = cal.add(3, 5);
           assertEquals(expected,actual);
       }
       @Test
       @Disabled // disables test method
       @DisplayName("Test case for add method") //display custom name for test method
       public void test2()
       {
           assertEquals(8,cal.add(4,4),"The add method should add two numbers.");
       }
   }


    @DisplayName("Test case for exception")
    @RepeatedTest(3)
    void testDivide(RepetitionInfo repetitionInfo)
    {
        repetitionInfo.getCurrentRepetition();
        assertThrows(ArithmeticException.class,() -> cal.divide(2,0),"divide method should throw an arithmetic exception" );
    }
    @Test
    void testMultiply()
    {
        // asserAll is used to assert bunch of statements into single statement to test.
        assertAll(
                () -> assertEquals(4,cal.multiply(2,2)),
                () -> assertEquals(6,cal.multiply(2,3)),
                () -> assertEquals(18,cal.multiply(9,2))
        );
    }
}