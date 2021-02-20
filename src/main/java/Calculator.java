import java.lang.*;
import java.util.*;

public class Calculator {
    public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double divide(double first, double second) {
        return first / second;
    }

    public double sqrroot(double base) {
        return Math.pow(base,1/2);
    }

    private double factorial_helper(double base, double remainder){
        if(base == 1) return remainder;

        return factorial_helper(base-1, base*remainder);
    }
    public double factorial(double base) {
        return factorial_helper(base, 1);
    }

    public double natural_log(double argument) {
        return logarithm(argument, Math.exp(1));
    }
    public double logarithm(double argument, double base) {
        return Math.log(argument)/Math.log(base);
    }

    public double power(double base, double power){
        return Math.pow(base,power);
    }

}
