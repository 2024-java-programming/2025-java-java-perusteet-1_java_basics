package java_basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Quest6Test {
    @Test
    @DisplayName("Test first element in Fibonacci series")
    public void test0() {
        Quest6 q6 = new Quest6();
        assertEquals(0, q6.fibonacci(0));
    }

    @Test
    @DisplayName("Test 5th element in Fibonacci series")
    public void test5() {
        Quest6 q6 = new Quest6();
        assertEquals(5, q6.fibonacci(5));
    }

    @Test
    @DisplayName("Test 31st element in Fibonacci series")
    public void test31() {
        Quest6 q6 = new Quest6();
        assertEquals(1346269, q6.fibonacci(31));
    }
}
