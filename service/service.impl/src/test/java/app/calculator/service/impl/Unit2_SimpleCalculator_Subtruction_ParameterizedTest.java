package app.calculator.service.impl;

import app.calculator.service.api.ISimpleCalculatorService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.Assert.assertEquals;

/**
 * <b>Unit 2</b>: ... demonstrates parameterized JUnit tests.
 *
 * @author java.developer(at)gmx.com
 */
public class Unit2_SimpleCalculator_Subtruction_ParameterizedTest {

    // ... dependencies

    private ISimpleCalculatorService<BigDecimal> serviceUnderTest = new SimpleCalculatorService_BigDecimalType();

    // ... constructors

    @DataProvider
    public static Object[][] testDataProvider() {

        final Object[][] testDataTriples_Arg1_Arg2_ExpectedResult = {
                {8, 5, 3},
                {3, 3, 0},
                {0, 0, 0},
                {1, 2, -1},
                {-3, -3, 0},
                {-8, -5, -3}
        };
        return testDataTriples_Arg1_Arg2_ExpectedResult;
    }

    @Test(dataProvider = "testDataProvider")
    public void test_Subtraction_Of(int arg1, int arg2, int expectedResult) {

        // ... run service under test
        final BigDecimal result =
                serviceUnderTest.sub(
                        BigDecimal.valueOf(arg1),
                        BigDecimal.valueOf(arg2)
                );

        // ... verify post-conditions
        assertEquals(BigDecimal.valueOf(expectedResult), result);
    }
}
