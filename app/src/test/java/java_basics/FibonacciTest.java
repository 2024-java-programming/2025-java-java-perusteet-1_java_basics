package java_basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FibonacciTest {
    @Test
    @DisplayName("Test 1st element in Fibonacci series")
    public void test1() {
        Fibonacci fib = new Fibonacci();
        assertEquals(0, fib.getNumber(0));
    }

    @Test
    @DisplayName("Test 2nd element in Fibonacci series")
    public void test2() {
        Fibonacci fib = new Fibonacci();
        assertEquals(1, fib.getNumber(1));
    }

    @Test
    @DisplayName("Test 32nd element in Fibonacci series")
    public void test32() {
        Fibonacci fib = new Fibonacci();
        assertEquals(1346269, fib.getNumber(31));
    }

    @Test
    @DisplayName("Test 36th element in Fibonacci series")
    public void test35() {
        Fibonacci fib = new Fibonacci();
        assertEquals(9227465, fib.getNumber(35));
    }

}
