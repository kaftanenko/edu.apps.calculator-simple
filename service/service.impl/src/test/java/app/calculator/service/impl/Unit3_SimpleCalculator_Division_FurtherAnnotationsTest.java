package app.calculator.service.impl;

import app.calculator.service.api.ISimpleCalculatorService;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 * <b>Unit 3</b>: ... demonstrates some further JUnit annotations and
 * parameters.
 *
 * <ul>
 * <li>@Ignore("&lt;some-comment&gt;")</li>
 * <li>@Test(expected=&lt;some-exception-class&gt;, timeout=&lt;time-in-ms&gt;)
 * </li>
 * </ul>
 *
 * @author java.developer(at)gmx.com
 */
public class Unit3_SimpleCalculator_Division_FurtherAnnotationsTest {

    // ... properties

    private ISimpleCalculatorService<BigDecimal> serviceUnderTest = new SimpleCalculatorService_BigDecimalType();

    // ... test methods

    @Test
    @Ignore("... is unimportant yet. But don't abuse the @Ignore annotation!")
    public void test_Demonstrating_Use_Of_The_Ignore_Annotaion() {

        fail("... is not implemented yet.");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void test_Division_Of_Positive_By_Zero_Numbers_WithExpecting_ArithmeticException() {

        final BigDecimal arg1 = BigDecimal.valueOf(7);
        final BigDecimal arg2 = BigDecimal.valueOf(0);

        serviceUnderTest.div(arg1, arg2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void test_Division_Of_Negative_By_Zero_Numbers_WithExpecting_ArithmeticException() {

        final BigDecimal arg1 = BigDecimal.valueOf(-7);
        final BigDecimal arg2 = BigDecimal.valueOf(0);

        serviceUnderTest.div(arg1, arg2);
    }

    @Test
    public void test_Division_Of_Two_Positive_Numbers() {

        final BigDecimal arg1 = BigDecimal.valueOf(100);
        final BigDecimal arg2 = BigDecimal.valueOf(2);
        BigDecimal expectedResult = BigDecimal.valueOf(50);

        BigDecimal result = serviceUnderTest.div(arg1, arg2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void test_Division_Of_Two_Negative_Numbers() {

        final BigDecimal arg1 = BigDecimal.valueOf(-99);
        final BigDecimal arg2 = BigDecimal.valueOf(-3);
        BigDecimal expectedResult = BigDecimal.valueOf(33);

        BigDecimal result = serviceUnderTest.div(arg1, arg2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void test_Division_Of_Positive_By_Negative_Numbers() {

        final BigDecimal arg1 = BigDecimal.valueOf(95);
        final BigDecimal arg2 = BigDecimal.valueOf(-5);
        BigDecimal expectedResult = BigDecimal.valueOf(-19);

        BigDecimal result = serviceUnderTest.div(arg1, arg2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void test_Division_Of_Negative_By_Positive_Numbers() {

        final BigDecimal arg1 = BigDecimal.valueOf(-96);
        final BigDecimal arg2 = BigDecimal.valueOf(4);
        BigDecimal expectedResult = BigDecimal.valueOf(-24);

        BigDecimal result = serviceUnderTest.div(arg1, arg2);

        assertEquals(expectedResult, result);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void test_Division_Of_By_Zero_Numbers() {

        final BigDecimal arg1 = BigDecimal.valueOf(94);
        final BigDecimal arg2 = BigDecimal.valueOf(0);

        serviceUnderTest.div(arg1, arg2);
    }
}
