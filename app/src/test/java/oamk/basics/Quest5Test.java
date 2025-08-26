package oamk.basics;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Quest 5")
public class Quest5Test {

  private static Quest5 quest5;
  private static ByteArrayOutputStream outContent;

  @BeforeEach
  public void init() {
    quest5 = new Quest5();
    outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
  }

  @AfterAll
  public static void cleanUp() {
    quest5 = null;
    outContent = null;
  }

  @Test
  @DisplayName("Test calculating factorial of 5")
  public void testFactorial() {
    quest5.factorial(5);
    assertEquals("120" + System.lineSeparator(), outContent.toString(),
      "Incorrect result when calculating factorial of 5");
  }

  @Test
  @DisplayName("Test calculating factorial of 0")
  public void testFactorialZero() {
    quest5.factorial(0);
    assertEquals("not allowed" + System.lineSeparator(), outContent.toString(),
      "Incorrect result when calculating factorial of 0");
  }

  @Test
  @DisplayName("Test calculating factorial of 21")
  public void testFactorialTwentyOne() {
    quest5.factorial(21);
    assertEquals("not allowed" + System.lineSeparator(), outContent.toString(),
      "Incorrect result when calculating factorial of 21");
  }

  @Test
  @DisplayName("Test calculating factorial of -1")
  public void testFactorialNegativeOne() {
    quest5.factorial(-1);
    assertEquals("not allowed" + System.lineSeparator(), outContent.toString(),
      "Incorrect result when calculating factorial of -1");
  }

  @Test
  @DisplayName("Test calculating factorial of 12")
  public void testFactorialTwelve() {
    quest5.factorial(12);
    assertEquals("479001600" + System.lineSeparator(), outContent.toString(),
      "Incorrect result when calculating factorial of 12");
  }
}
