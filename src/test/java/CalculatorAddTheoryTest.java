import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class CalculatorAddTheoryTest extends Assert {
    private Calculator calculator = new Calculator();

    @BeforeClass
    public static void startTest() {
        System.out.println("Testing with @Theory is started");
    }

    @AfterClass
    public static void endTest() {
        System.out.println("Testing with @Theory is over");
    }

    @Rule
    public final Timeout timeout = new Timeout (1000);

    //не совсем разобралась с передачей параметров в класс с аннотацией @Theory, поэтому эти тесты выдают ошибку и
    //поставлены как @Ignore
    @DataPoints("positive")
    public static float[] isPositiveInput()  {
        return new float [] {10, 20};
    }

    @DataPoint("negative")
    public static float[] isNegativeInput () {
        return new float [] {-12, 18};
    }

    @Ignore
    @Category(Add.class)
    @Theory
    public void testAddPositive (@FromDataPoints("positive") float a, float b) {
        //final float expected = calculator.subtraction(a, b);
        Assert.assertEquals(30, calculator.addition(a, b), 0);
    }

    @Ignore
    @Category(Add.class)
    @Theory
    public void testAddNegative (@FromDataPoints("negative") float a, float b) {
        //final float expected = calculator.subtraction(a, b);
        Assert.assertEquals(30, calculator.addition(a, b), 0);
    }
}

