import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

    @RunWith(Parameterized.class)
    public class CalculatorModParamTest extends Assert {
        private final int testNum1;
        private final int testNum2;
        private final int expectedResult;
        private final int testDelta;
        private Calculator calculator = new Calculator();

        @BeforeClass
        public static void startTest() {
            System.out.println("Testing with Parameters is started");
        }

        @AfterClass
        public static void endTest() {
            System.out.println("Testing with Parameters method is over");
        }

        @Rule
        public final Timeout timeout = new Timeout (1000);

        public CalculatorModParamTest (final int testNum1, final int testNum2, final int expectedResult, final int testDelta) {
        this.testNum1 = testNum1;
        this.testNum2 = testNum2;
        this.expectedResult = expectedResult;
        this.testDelta = testDelta;
        }

        @Parameterized.Parameters
        public static List<Object[]> isEmptyData() {
            return Arrays.asList(new Object[][] {
                    { 18, 4, 2, 0 },
                    { 20, 5, 0, 0 },
                    { 31, 6, 1, 0 }
            });
        }

       // @Category(Modulo.class)
        @Test
        public void useParams() {
            final float actualResult = calculator.modulo(testNum1, testNum2);
            Assert.assertEquals(expectedResult, actualResult, testDelta);
        }

}