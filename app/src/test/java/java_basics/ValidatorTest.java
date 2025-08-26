package java_basics;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Validator")
public class ValidatorTest {

  private static Validator validator;
  private static ByteArrayOutputStream outContent;

  @BeforeEach
  public void init() {
    validator = new Validator();
    outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
  }

  @AfterAll
  public static void cleanUp() {
    validator = null;
    outContent = null;
  }

  @Test
  @DisplayName("Test printing even numbers up to 9")
  public void testOddOut() {
    validator.oddOut((short) 9);
    assertEquals("2,4,6,8", outContent.toString(),
      "Incorrect result when printing even numbers up to 9");
  }

  @Test
  @DisplayName("Test printing even numbers up to 0")
  public void testOddOutZero() {
    validator.oddOut((short) 0);
    assertEquals("No even numbers to print.", outContent.toString(),
      "Incorrect result when printing even numbers up to 0");
  }

  @Test
  @DisplayName("Test printing even numbers up to 2")
  public void testOddOutTwo() {
    validator.oddOut((short) 2);
    assertEquals("2", outContent.toString(),
      "Incorrect result when printing even numbers up to 2");
  }
}
