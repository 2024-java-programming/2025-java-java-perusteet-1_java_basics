package oamk.basics;

/*
 * Modify the method below to print out all even numbers above zero until the
 * function parameter limit. The numbers are separated by comma and printed
 * without new line.
 * 
 * Example output when limit is 9:
 * 2,4,6,8
 */

public class Quest4 {
  public void oddOut(short limit) {
    if (limit <= 0) {
      System.out.println("No even numbers to print.");
      return;
    }

    for (short i = 2; i <= limit; i += 2) {
      System.out.print(i);

      if (i < limit - 1) {
        System.out.print(",");
      }
    }
  }
}
