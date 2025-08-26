package java_basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FibonacciTest {
    @Test
    @DisplayName("Test first element in Fibonacci series")
    public void testFibo1() {
        Fibonacci q6 = new Fibonacci();
        assertEquals(0, q6.getNumber(0));
    }

    @Test
    @DisplayName("Test second element in Fibonacci series")
    public void testFibo2() {
        Fibonacci q6 = new Fibonacci();
        assertEquals(1, q6.getNumber(1));
    }

    @Test
    @DisplayName("Test 32st number in Fibonacci series")
    public void testFibo32() {
        Fibonacci q6 = new Fibonacci();
        assertEquals(1346269, q6.getNumber(31));
    }

    @Test
    @DisplayName("Test 36th number in Fibonacci series")
    public void testFibo35() {
        Fibonacci q6 = new Fibonacci();
        assertEquals(9227465, q6.getNumber(35));
    }
}
