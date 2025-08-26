package java_basics;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Checker")
public class CheckerTest {

  private static Checker checker;
  private static ByteArrayOutputStream outContent;

  @BeforeEach
  public void init() {
    checker = new Checker();
    outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
  }

  @AfterAll
  public static void cleanUp() {
    checker = null;
    outContent = null;
  }

  @Test
  @DisplayName("Test positive number")
  public void testPositiveNumber() {
    checker.checkNum(5);
    assertEquals("pos" + System.lineSeparator(), outContent.toString(),
      "Incorrect output when the number is positive");
  }

  @Test
  @DisplayName("Test negative number")
  public void testNegativeNumber() {
    checker.checkNum(-5);
    assertEquals("neg" + System.lineSeparator(), outContent.toString(),
      "Incorrect output when the number is negative");
  }

  @Test
  @DisplayName("Test zero")
  public void testZero() {
    checker.checkNum(0);
    assertEquals("zero" + System.lineSeparator(), outContent.toString(),
      "Incorrect output when the number is zero");
  }
}
