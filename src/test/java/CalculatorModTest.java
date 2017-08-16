import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.Timeout;

public class CalculatorModTest {
    private Calculator calculator = new Calculator();

    @BeforeClass
    public static void startTest() {
        System.out.println("Testing Module method is started");
    }

    @AfterClass
    public static void endTest() {
        System.out.println("Testing Module method is over");
    }

    @Rule
    public final Timeout timeout = new Timeout (1000);

    @Category(Modulo.class)
    @Test
    public void moduloTest() {
        Assert.assertEquals(2, calculator.modulo(18, 4), 0);
    }
}