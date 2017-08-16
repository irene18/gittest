import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

public class CalculatorMulDivTest {
    private Calculator calculator = new Calculator();

    @BeforeClass
    public static void startTest() {
        System.out.println("Testing Multiplication and Division methods is started");
    }

    @AfterClass
    public static void endTest() {
        System.out.println("Testing Multiplication and Division methods is over");
    }

    @Rule
    public final Timeout timeout = new Timeout (1000);

    @Test
    public void multiplicationTest() {
       Assert.assertEquals(56, calculator.multiplication(7, 8), 0);
    }

    @Test
    public void divisionTest() {
        Assert.assertEquals(4, calculator.division(36, 9), 0);
    }
}