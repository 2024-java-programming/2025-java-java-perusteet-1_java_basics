# Assignment 1 - Java Basics

In this repository, you will find a series of exercises in the `app/src/main` directory designed to help you practice the concepts learned during the first lesson. Each exercise is called a "Quest" and has a corresponding test class to help you verify your solution.

## Requirements

For this assignment and the rest of the course, you will need the following tools:

- Java Development Kit (JDK) 21 or later.

## Setup

1. Clone this repository to your local machine.
2. Open the project in your IDE.
3. Follow the instructions in the `Quest#` classes to complete the exercises.
4. Run the tests to verify your solution (see below).

## Testing

> [!NOTE]
> If you are using an Integrated Development Environment (IDE) or a code editor with Java support, you may be able to run the tests using the IDE's GUI or built-in testing features. Please refer to your IDE's documentation for instructions on how to do this.

The test cases for each quest are located in the `app/src/test` directory and were implemented using JUnit 5.

To run the tests for all the quests, you can use the following command:

  ```bash
  ./gradlew test
  ```

The ./gradlew script is a wrapper that downloads and uses the correct version of Gradle to run the tests.

To run the tests for a specific quest, you can use the following command:

  ```bash
  ./gradlew test --tests Quest1Test
  ```

Replace `Quest1Test` with the name of the test class you want to run.

On Windows, use `gradlew.bat` instead of `./gradlew`.

## Submission

Commit your changes and push them to the github classroom repository.
The CI/CD pipeline will run the tests and check your code for quality.
If everything is correct, you will see a green checkmark on your commit.

## Troubleshooting

If you see a red cross after submitting your solution, check the test output for more detailed error messages. You can find the test output in the `Actions` tab or by running the tests locally.
