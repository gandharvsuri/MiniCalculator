import org.junit.Assert;

import org.junit.*;
import sun.awt.SunToolkit;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.Global.NaN;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

public class ScientificCalciTests {

    @BeforeClass
    public static void beforeCalciClass(){
        System.out.println("Running Scientific Calci Tests");
    }

    @Test
    public void SquarerootTesting() {
        Calculator calci = new Calculator();
        Assert.assertEquals("Square Root ", 1.3038404810405297, calci.sqrroot(1.7), 1e-15);
        Assert.assertEquals("Square Root ", 0, calci.sqrroot(0), 1e-15);
        Assert.assertEquals("Square Root ", NaN, calci.sqrroot(-1), 1e-15);
        Assert.assertEquals("Square Root ", 2.23606797749979, calci.sqrroot(5), 1e-15);
    }

    @Test
    public void FactorialTesting() {
        Calculator calci = new Calculator();
        Assert.assertEquals("Factorial Testing ", 120, calci.factorial(5), 1e-15);
        Assert.assertEquals("Factorial Testing ", 1, calci.factorial(0), 1e-15);
//        Assert.assertEquals("Factorial Testing ", NaN, calci.factorial(-1), 1e-15);
        Assert.assertEquals("Factorial Testing ", 2, calci.factorial(2), 1e-15);
    }

    @Test
    @Ignore("Need to work on logarithmic Testing")
    public void logarithmicTesting() {
        Calculator calci = new Calculator();
        Assert.assertEquals("Natural Logarithmic Testing ", 1.3862943611198906, calci.natural_log(4), 1e-15);
//        Assert.assertEquals("Natural Logarithmic Testing ", -1/0, calci.natural_log(0), 1e-15);
//        Assert.assertEquals("Natural Logarithm Testing", NaN, calci.natural_log(-1), 1e-15);
//        Assert.assertEquals("Natural Logarithmic Testing ", 4, calci.natural_log(2), 1e-15);
    }
}
