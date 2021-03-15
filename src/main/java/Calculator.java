import java.beans.PropertyEditorSupport;
import java.lang.*;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Float.NaN;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator, Choose to perform operation");
            System.out.print("Press 1 to Add\nPress 2 to Subtract\nPress 3 to Multiply\nPress 4 to Divide\n"+
                    "Press 5 to calculate Square Root\nPress 6 to calculate Factorial\nPress 7 to calculate Natural Logarithm\nPress 8 to calculate Power\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter the first number : ");
                        number1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        number2 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Addition result is : " + calculator.add(number1, number2));
                    break;
                case 2:
                    try {
                        System.out.print("Enter the first number : ");
                        number1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        number2 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Subtraction result is : " + calculator.subtract(number1, number2));
                    break;
                case 3:
                    try {
                        System.out.print("Enter the first number : ");
                        number1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        number2 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Multiplication result is : " + calculator.multiply(number1, number2));
                    break;
                case 4:
                    try {
                        System.out.print("Enter the first number : ");
                        number1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        number2 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Division result is : " + calculator.divide(number1, number2));
                    break;
                case 5:
                    //Squareroot
                    try {
                        System.out.print("Enter the number : ");
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Division result is : " + calculator.sqrroot(number1));
                    break;
                case 6:
                    //Factorial
                    try {
                        System.out.print("Enter the number : ");
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Division result is : " + calculator.factorial(number1));
                    break;
                case 7: //Natural Logarithm
                    try {
                        System.out.print("Enter the number : ");
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Division result is : " + calculator.natural_log(number1));
                    break;
                case 8: //Power Function
                    try {
                        System.out.print("Enter the base number : ");
                        number1 = scanner.nextDouble();
                        System.out.print("Enter the power : ");
                        number2 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Division result is : " + calculator.power(number1, number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }

            System.out.print("\n\n");
        } while (true);
    }
    public double add(double first, double second) {
        logger.info("[ADD] :" + first + "," + second);
        double result = first + second;
        logger.info("[ADD RESULT] :" + result);
        return result;
    }

    public double subtract(double first, double second) {
        logger.info("[SUBTRACT] :" + first + "," + second);
        double result = first - second;
        logger.info("[SUBTRACT RESULT] :" + result);
        return result;
    }

    public double multiply(double first, double second) {
        logger.info("[MULTIPLY] :" + first + "," + second);
        double result =  first * second;
        logger.info("[MULTIPLY RESULT] :" + result);
        return result;
    }

    public double divide(double first, double second) {
        logger.info("[DIVIDE :" + first + "," + second);
        double result = 0;
        try{
            if(second == 0){
                result = Double.NaN;
                throw new ArithmeticException("Division by 0");
            }
            else{
                result = first/second;
            }
        }
        catch (ArithmeticException error){
            logger.error("[DIVISION EXCEPTION] : DIVISION BY ZERO "+ error.getLocalizedMessage());
        }

        finally {
            logger.info("[DIVISION RESULT : " + result);
        }

        return  result;
    }

    public double sqrroot(double base) {
        logger.info("[SQUARE ROOT] : " + base);
        double result = 0;

        try {
            if(base < 0){
                result = Double.NaN;
                throw new ArithmeticException("Square root of negative number");
            }
            else{
                result = Math.pow(base,(double) 1/2);
            }
        }
        catch (ArithmeticException error){
            logger.error("[SQUARE ROOT EXCEPTION] - NEGATIVE BASE "+ error.getLocalizedMessage());
        }
        finally {
            logger.info("[RESULT SQUARE ROOT] : "+result);
        }
        return result;
    }

    private double factorial_helper(double base, double remainder){
        if(base == 0) return remainder;

        if(base < 0) return NaN;
        return factorial_helper(base-1, base*remainder);
    }
    public double factorial(double base) {
        logger.info("[FACTORIAL] : " + base);
        double result = 0;

        try {
            if(base < 0){
                result = Double.NaN;
                throw new ArithmeticException("Factorial of negative number");
            }
            else{
                result = factorial_helper(base, 1);
            }
        }
        catch (ArithmeticException error){
            logger.error("[FACTORIAL EXCEPTION] - NEGATIVE BASE "+ error.getLocalizedMessage());
        }
        finally {
            logger.info("[RESULT FACTORIAL] : "+result);
        }
        return result;
    }

    public double natural_log(double argument) {
        logger.info("[NATURAL LOG] : " + argument);
        double result = 0;

        try {
            if(argument <= 0){
                result = Double.NaN;
                throw new ArithmeticException("Logarithm of non positive number");
            }
            else{
                result = logarithm(argument, Math.exp(1));
            }
        }
        catch (ArithmeticException error){
            logger.error("[LOGARITHM EXCEPTION] - NON POSITIVE BASE "+ error.getLocalizedMessage());
        }
        finally {
            logger.info("[RESULT NATURAL LOGARITHM] : "+result);
        }
        return result;
    }
    private double logarithm(double argument, double base) {
        return Math.log(argument)/Math.log(base);
    }

    public double power(double base, double power){
        logger.info("[POWER] :" + base + "," + power);
        double result = 0;
        try{
            if(base == 0 && power <= 0){
                result = Double.NaN;
                throw new ArithmeticException("Indeterministic form");
            }
            else{
                result = Math.pow(base,power);
            }
        }
        catch(ArithmeticException error){
            logger.error("[POWER EXCEPTION] - INDETERMINISTIC FORM "+ error.getLocalizedMessage());
        }
        finally {
            logger.info("[POWER RESULT] :" + result);
        }
        return result;
    }

}
