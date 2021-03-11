import java.beans.PropertyEditorSupport;
import java.lang.*;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Float.NaN;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

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
