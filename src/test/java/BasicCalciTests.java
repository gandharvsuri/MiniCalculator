import org.junit.Assert;

import org.junit.*;
import sun.awt.SunToolkit;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.Global.NaN;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


public class BasicCalciTests {
    @BeforeClass
    public static void beforeCalciClass(){
        System.out.println("Running Basic Calci Tests");
    }

    @Test
    public void multiplicationTesting() {
        Calculator calci = new Calculator();
        Assert.assertEquals("Multiplication ", 2, calci.multiply(1, 2), 1e-15);
        Assert.assertEquals("Multiplication ", 0, calci.multiply(0, 2), 1e-15);
        Assert.assertEquals("Multiplication ", 8, calci.multiply(4, 2), 1e-15);
        Assert.assertEquals("Multiplication ", 36, calci.multiply(4, 9), 1e-15);
    }

    @Test
    public void additionTesting() {
        Calculator calci = new Calculator();
        Assert.assertEquals("Addition ", 2, calci.add(0, 2), 1e-15);
        Assert.assertEquals("Addition ", 6, calci.add(4, 2), 1e-15);
        Assert.assertEquals("Addition ", 3, calci.add(1, 2), 1e-15);
        Assert.assertEquals("Addition ", 13, calci.add(4, 9), 1e-15);
    }

    @Test
    public void subtractionTesting() {
        Calculator calci = new Calculator();
        Assert.assertEquals("Subtraction ", -2, calci.subtract(0, 2), 1e-15);
        Assert.assertEquals("Subtraction ", 2, calci.subtract(4, 2), 1e-15);
        Assert.assertEquals("Subtraction ", -1, calci.subtract(1, 2), 1e-15);
        Assert.assertEquals("Subtraction ", 9, calci.subtract(9, 0), 1e-15);
    }

    public void divisonTesting() {
        Calculator calci = new Calculator();
        Assert.assertEquals("Division ", 0, calci.divide(0, 2), 1e-15);
        Assert.assertEquals("Division ", 2, calci.divide(4, 2), 1e-15);
        Assert.assertEquals("Division ", 0.5, calci.divide(1, 2), 1e-15);
        Assert.assertEquals("Division ", Double.NaN, calci.divide(9, 0), 1e-15);
    }
}
