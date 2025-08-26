package java_basics;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Factorial")
public class FactorialTest {

  private static Factorial factorial;
  private static MethodHandle factorialHandle;

  @BeforeEach
  public void init() throws Exception {
    factorial = new Factorial();
    MethodType methodType = MethodType.methodType(Long.class, Integer.class);
    factorialHandle = MethodHandles.lookup().findVirtual(Factorial.class, "factorial", methodType);
  }

  @AfterAll
  public static void cleanUp() {
    factorial = null;
  }

  @Test
  @DisplayName("Test calculating factorial of 5")
  public void testFactorial() throws Throwable {
    Long result = (Long)factorialHandle.invoke(factorial, 5);
    assertEquals(120L, result);
  }

  @Test
  @DisplayName("Test calculating factorial of 0")
  public void testFactorialZero() throws Throwable {
    Long result = (Long)factorialHandle.invoke(factorial, 0);
    assertEquals(-1L, result);
  }

  @Test
  @DisplayName("Test calculating factorial of 21")
  public void testFactorialTwentyOne() throws Throwable {
    Long result = (Long)factorialHandle.invoke(factorial, 21);
    assertEquals(-1L, result);
  }

  @Test
  @DisplayName("Test calculating factorial of -5")
  public void testFactorialNegativeFive() throws Throwable {
    Long result = (Long)factorialHandle.invoke(factorial, -5);
    assertEquals(-1L, result);
  }

  @Test
  @DisplayName("Test calculating factorial of 12")
  public void testFactorialTwelve() throws Throwable {
    factorialHandle.invoke(factorial, 12);
    Long result = (Long)factorialHandle.invoke(factorial, 12);
    assertEquals(479001600L, result);
  }
}
