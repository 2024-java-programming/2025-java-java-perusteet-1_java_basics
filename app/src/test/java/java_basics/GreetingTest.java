package java_basics;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Greeting")
public class GreetingTest {

  private static Greeting greeting;
  private static ByteArrayOutputStream outContent;

  @BeforeEach
  public void init() {
    greeting = new Greeting();
    outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
  }

  @AfterAll
  public static void cleanUp() {
    greeting = null;
    outContent = null;
  }

  @Test
  @DisplayName("Test greeting two visitors")
  public void testGreetTwo() {
    String[] visitors =  { "Kaisa", "Jussi" };
    greeting.greet(visitors);
    assertEquals("Hello Kaisa, you are visitor number 1" + System.lineSeparator() +
      "Hello Jussi, you are visitor number 2" + System.lineSeparator(), outContent.toString(),
      "Incorrect result when greeting two visitors");
  }

  @Test
  @DisplayName("Test greeting five visitors")
  public void testGreetFive() {
    String[] visitors =  { "Alice", "Bob", "Charlie", "David", "Emma" };
    greeting.greet(visitors);
    assertEquals("Hello Alice, you are visitor number 1" + System.lineSeparator() +
      "Hello Bob, you are visitor number 2" + System.lineSeparator() +
      "Hello Charlie, you are visitor number 3" + System.lineSeparator() +
      "Hello David, you are visitor number 4" + System.lineSeparator() +
      "Hello Emma, you are visitor number 5" + System.lineSeparator(), outContent.toString(),
      "Incorrect result when greeting five visitors");
  }
}
