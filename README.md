# Assignment 1 - Java Basics

In this repository, you will find a series of exercises in the `app/src/main` directory designed to help you practice the Java basics learned during the first lesson. Each exercise is called a "Quest" and has a corresponding test class to help you verify your solution.

## Workflow for the assignment

1. Clone this repository to your local machine.

2. Open the project in VS Code.

3. Run the project as it is, just to make sure it works. The program should output something like `Main does nothing`

4. You can also run the tests now. Obviously, if you haven't finished quests, tests will fail now and you will a lot of errors.

5. Follow the instructions below for each `Quest#` to complete the assignment.

6. You can any time run the tests to see if your answer code is correct.

## Quest 1

 Modify the code, i.e. method `multiply(Integer a, Integer b)` by following the instructions:

 1. Multiply the method parameters, i.e. variables a and b

 2. Multiply the product by two

 3. Add one to the new product

 4. Print the final product to the console

## Quest 2

Modify the code in method `checkNum(Integer num)` to:

- Print out to console string `pos`, if the parameter value is positive

- Print out to console string `neg`, if the parameter value is negative

- Print out to console string `zero`, if the parameter equals zero

## Quest 3

Modify the method `greet(Integer visitors)` to greet all visitors by printing out to console the string `Hello n!` for each of them, where n is the number of the visitor, starting from 1.

## Quest 4

Modify the method `oddOut(Short limit)` to print out all even numbers above zero until the function parameter limit. The numbers are separated by comma and printed without new line.

Example output, when limit is 9: `2,4,6,8`

## Quest 5

Create a method `factorial()` that calculates the factorial of the parameter num, where the value of num must be between 1 and 20. Print out the result to the console.

If the value of num is less than 1 or larger than 20, the function prints out string `not allowed`.

Note: The method should be public and the return type should be void.

Example output when num is 5: `120`

Example output when num is 0: `not allowed`

## Quest 6

Ok, let's next have a big more complex quest. 

[Fibonacci sequence](https://en.wikipedia.org/wiki/Fibonacci_sequence) is a well-known sequence of numbers with _very_ interesting properties.

In the sequence, each number is the sum of two preceding numbers, starting from 0 and 1. So, for example `0,1,1,2,3,5,8,13,21,34`.

Your quest is to find the nth element in such Fibonacci series. For example, 5th element in the sequence is `5` and 8th element is `21`. 

Some ideas for this quest:

- Maybe `do-while` loop could be useful?

- Maybe a set of variables or an array of Integers would work to store the values in the sequence?

## Testing

The test cases for each quest are located in the `app/src/test` directory.

With VS Code, you can run the tests using the `Testing extension` in the left side bar.

Once you have answered all the quests (or purposedly don't want finish all of them), run tests once more to see that all test cases succeed.

> [!NOTE]
> It is possible to locally edit the test cases, but when you submit your code to the GitHub classroom, your submission is marked with a red flag. This is obviously not acceptable..

Also, you can run tests manually using the `VS Code terminal` with the following command:

  ```bash
  ./gradlew test
  ```

The ./gradlew script is a wrapper that runs the tests. (On Windows, use `gradlew.bat` instead of `./gradlew`.)

To run the tests for a specific quest, you can use the following command:

  ```bash
  ./gradlew test --tests Quest1Test
  ```

Replace `Quest1Test` with the name of the test class you want to run.

## Submission

Once you are happy with your answers, `commit and push` your code back to the Github classroom.

This triggers the automatic tester run the tests once more in the background and calculate your points for the assignment.

If tests were successfully run, (regardless of your score if it's more than 0) you will see a green checkmark on your commit in your personal repository for the assignment.

If you see a red cross in your repository after submitting your solution, check the test output for more detailed error messages.

You can find the test output in the Actions tab in your GitHub repository or obviously by running the ests locally.
