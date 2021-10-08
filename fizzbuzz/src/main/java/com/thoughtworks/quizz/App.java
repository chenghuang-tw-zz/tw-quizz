package com.thoughtworks.quizz;

/**
 * FizzBuzz
 */
public class App {

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    for (int i = 0; i < 200; i++) {
        System.out.println("Number is " + i + ", report is: " + fizzBuzz.report(i));
    }
  }
}
