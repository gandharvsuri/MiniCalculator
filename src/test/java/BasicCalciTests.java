import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BasicCalciTests {
    @BeforeClass
    public static void beforeCalciClass(){
        System.out.println("Running Basic Calci Tests");
    }

    @Parameter(0)
    public double a; // 1

    @Parameter(1)
    public double b; // 2

    @Parameter(2)
    public double result; // 2

    @Parameters
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][] {{1,2,2}, {2,5,10}, {0, 10, 0}};
        return Arrays.asList(data);
    }

    @Test
    public void multiplicationTesting() {
        Calculator calci = new Calculator();
        Assert.assertEquals("Multiplication", result, calci.multiply(a, b), 1e-15);
    }
}
