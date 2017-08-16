import org.junit.experimental.categories.Categories;
        import org.junit.runner.RunWith;
        import org.junit.runners.Suite;


@RunWith(Categories.class)
@Categories.IncludeCategory({ Modulo.class, Add.class })
@Suite.SuiteClasses({ CalculatorAddSubTest.class, CalculatorMulDivTest.class, CalculatorModTest.class, CalculatorModParamTest.class, CalculatorAddTheoryTest.class })

public class CalculatorSuiteTest {
}
