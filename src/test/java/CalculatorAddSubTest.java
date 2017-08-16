import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.Timeout;
import org.junit.Ignore;


public class CalculatorAddSubTest {
    private Calculator calculator = new Calculator();

    @BeforeClass
    public static void startTest() {
        System.out.println("Testing Addition and Subtraction methods is started");
    }

    @AfterClass
    public static void endTest() {
        System.out.println("Testing Addition and Subtraction methods is over");
    }

    @Rule
    public final Timeout timeout = new Timeout (1000);

    @Category(Add.class)
    @Test
    public void additionTest() {
        Assert.assertEquals(9, calculator.addition(3, 6), 0);
    }

    @Test
    public void subtractionTest() {
        Assert.assertEquals(2, calculator.subtraction(7, 5), 0);
    }

    @Ignore
    @Test
    public void subtractionNewTest() {
        Assert.assertEquals(100, calculator.subtraction(13, 6), 0);
    }
}
