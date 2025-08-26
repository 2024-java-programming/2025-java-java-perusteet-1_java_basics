# Assignment 1 - Java Basics

In this repository, you will find a series of exercises in the `app/src/main` directory designed to help you practice the Java basics learned during the first lesson. Each exercise corresponding test source files and class(es) to help you verify your solution.

## Workflow for the assignment

1. Clone this repository to your local machine.

2. Open the project in VS Code.

3. Run the project as it is, just to make sure it works. The program should output something like `Main does nothing`.

4. You can also run the tests now. Obviously, if you haven't finished quests, tests will fail now and you will see a lot of errors.

5. Follow the instructions below for each `Quest#` to complete the assignment.

6. You can any time run the tests to see if your answer code is correct.

## Multiplier (1p)

 Modify the code, i.e. method `multiply(Integer a, Integer b)` by following the instructions:

 1. Multiply the method parameters, i.e. variables a and b.

 2. Multiply the product by two.

 3. Add one to the new product.

 4. Print the final product to the console.

## Checker (1p)

Modify the code in method `checkNum(Integer num)` to:

- Print out to console string `pos`, if the parameter value is positive.

- Print out to console string `neg`, if the parameter value is negative.

- Print out to console string `zero`, if the parameter equals zero.

## Greeting (1p)

Modify the method `greet(String[] visitors)` to greet visitors whose names are given in the String array, by printing out to console the message `Hello name, you are visitor number n` for each of them, where `name` is the visitor name and `n` is the number of the visitor, starting from 1.

## Validator (1p)

Modify the method `oddOut(Short limit)` to print out all even numbers above zero until the function parameter limit. The numbers are separated by comma and printed without new line. If the parameter is value is zero or less than zero, print out string `No even numbers to print.` without new line.

Example output, when limit is `9`, print out `2,4,6,8`.

## Factorial (1p)

Create a method `factorial(Integer num)` that calculates the factorial of the parameter `num`, where the value of num must be between 1 and 20. Return the result as type `Long`.

If the value of `num` is less than 1 or larger than 20, the function returns -1.

Example output when num is 5: `120`

Example output when num is 0: `-1`

## Fibonacci (1p)

Ok, let's next have a bit more complex exercise. [Fibonacci sequence](https://en.wikipedia.org/wiki/Fibonacci_sequence) is a well-known sequence of numbers with _very_ interesting properties.

In the sequence, each number is the sum of two preceding numbers, starting from 0 and 1. So, 1st element is 0, 2nd element is 1, 3rd element is 0+1=1, 4th element is 1+1=2, 5th element is 1+2=3, 6th element is 2+3=5 and so on, resulting `0,1,1,2,3,5,8,13,21,34,..`.

Your task is to write the algorithm for Fibonacci sequence and find the `nth` element in the sequence. Write the algorithm into the class method `getNumber(Integer n)`, which should return `Integer`.

Some ideas for this task:

- Note that with computers the _first element of series has index 0_.

- Typically the first two sequence numbers (0 and 1) are predefined, so the 3rd element can be calculated easily.

- Maybe use a set of variables to store the preceding values in the sequence?

- You could also use a recursive function (a function that calls itself)..

- In fact, you will need your algorithm implementation in later exercises.

## Testing

The test cases for each quest are located in the `app/src/test` directory.

With VS Code, you can run the tests using the `Testing extension` in the left side bar.

Once you have finished an exercise, you can run test cases for it. Once all exercises are completed (or some of them if you decide not to work on them all), run tests once more to verify that all test cases succeed.

> [!NOTE]
> It is possible to locally edit the test cases, but when you submit your code to the GitHub classroom, your submission is marked with a red flag. This is obviously not acceptable..

Also, you can run tests manually using the `VS Code terminal` with the following command:

  ```bash
  ./gradlew test
  ```

The ./gradlew script is a wrapper that runs the tests. (On Windows, use `gradlew.bat` instead of `./gradlew`.)

To run the tests for a specific quest, you can use the following command:

  ```bash
  ./gradlew test --tests MultiplierTest
  ```

Replace `MultiplierTest` with the name of the test class you want to run.

## Submission

Once you are happy with your tested answers, `commit and push` your code back to the Github classroom.

This triggers the remote automatic tester once more in the background, which calculates your score for the assignment.

> [!NOTE]
> Completing the exercises locally in VS Code is not enough, but your answer code must be submitted back to GitHub classroom for the actual grading to take place.

If all the tests were successfully run, you will see a green checkmark on your commit in your personal repository for the assignment.

If you see a red cross in your repository after submitting your solution, this means that some test cases failed. So, check the test output for more detailed error messages. You can find the test output in the Actions tab in your GitHub repository or obviously by running the tests locally.
