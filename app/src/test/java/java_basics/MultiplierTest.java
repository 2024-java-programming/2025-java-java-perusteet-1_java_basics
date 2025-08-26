package java_basics;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Multiplier")
public class MultiplierTest {

  private static Multiplier multiplier;
  private static ByteArrayOutputStream outContent;

  @BeforeEach
  public void init() {
    multiplier = new Multiplier();
    outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
  }

  @AfterAll
  public static void cleanUp() {
    multiplier = null;
    outContent = null;
  }

	@Test
  @DisplayName("Test multiplying by zero")
	public void testMultiplyByZero() {
		multiplier.multiply(5, 0);
		assertEquals("1" + System.lineSeparator(), outContent.toString(),
      "Incorrect output when multiplying by zero");
	}

  @Test
  @DisplayName("Test multiplying two numbers")
  public void testMultiply() {
    multiplier.multiply(5, 3);
    assertEquals("31" + System.lineSeparator(), outContent.toString(),
      "Incorrect output when multiplying two numbers");
  }
}
