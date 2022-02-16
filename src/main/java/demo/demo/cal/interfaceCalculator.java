package demo.demo.cal;

import java.util.Scanner;

/**
 * @author umaima
 * @version 17.0
 */
public class interfaceCalculator {

  public static void main(String[] args) {

    /**
     * represent the opreation
     */
    char operator;
    /**
     * represent number1, number2, result
     */
    Double num1, num2, result;

    /**
     * create an object of Scanner class
     */
    Scanner input = new Scanner(System.in);

    /**
     * ask users to enter operator
     */
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    /**
     * ask users to enter the first number
     */
    System.out.println("Enter first number");
    num1 = input.nextDouble();

    /**
     * ask users to enter the second number
     */
    System.out.println("Enter second number");
    num2 = input.nextDouble();

    switch (operator) {

      /**
       * performs addition between numbers
       */
      case '+':
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;

      /**
       * performs subtraction between numbers
       */
      case '-':
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;

      /**
       * performs multiplication between numbers
       */
      case '*':
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;

      /**
       * performs division between numbers
       */
      case '/':
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        break;

      /**
       * show error when operator Invalid
       */
      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}