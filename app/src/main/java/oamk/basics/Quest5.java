package oamk.basics;

/*
 * Create a funciton factorial() that calculates the factorial of the given function
 * parameter num, where the value of num must be between 1 and 20. Print out the
 * result to the console. If the value of num is less than 1 or larger than 20,
 * the function prints out string "not allowed".
 * 
 * Note: The function should be public and the return type should be void.
 * 
 * Example output when num is 5:
 * 120
 * 
 * Example output when num is 0:
 * not allowed
 */

public class Quest5 {
  public void factorial(int num) {
    if (num < 1 || num > 20) {
      System.out.println("not allowed");
      return;
    }
    int result = 1;
    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    System.out.println(result);
  }
}
