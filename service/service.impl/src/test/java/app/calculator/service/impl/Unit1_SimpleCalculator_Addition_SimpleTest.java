package app.calculator.service.impl;

import app.calculator.service.api.ISimpleCalculatorService;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.Assert.assertEquals;

/**
 * <b>Unit 1</b>: ... JUnit simple JUnit Test.
 *
 * @author java.developer(at)gmx.com
 */
public class Unit1_SimpleCalculator_Addition_SimpleTest {

    // ... properties

    private ISimpleCalculatorService<BigDecimal> serviceUnderTest = new SimpleCalculatorService_BigDecimalType();

    // ... test methods

    @Test
    public void test_Addition_Of_Two_Positive_Numbers() {

        final BigDecimal arg1 = BigDecimal.valueOf(2);
        final BigDecimal arg2 = BigDecimal.valueOf(3);
        final BigDecimal expectedResult = BigDecimal.valueOf(5);

        BigDecimal result = serviceUnderTest.add(arg1, arg2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void test_Addition_Of_Two_Negative_Numbers() {

        final BigDecimal arg1 = BigDecimal.valueOf(-2);
        final BigDecimal arg2 = BigDecimal.valueOf(-3);
        final BigDecimal expectedResult = BigDecimal.valueOf(-5);

        BigDecimal result = serviceUnderTest.add(arg1, arg2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void test_Addition_Of_Positive_And_Zero_Numbers() {

        final BigDecimal arg1 = BigDecimal.valueOf(1);
        final BigDecimal arg2 = BigDecimal.valueOf(0);
        final BigDecimal expectedResult = BigDecimal.valueOf(1);

        BigDecimal result = serviceUnderTest.add(arg1, arg2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void test_Addition_Of_Two_Zero_Numbers() {

        final BigDecimal arg1 = BigDecimal.valueOf(0);
        final BigDecimal arg2 = BigDecimal.valueOf(0);
        final BigDecimal expectedResult = BigDecimal.valueOf(0);

        BigDecimal result = serviceUnderTest.add(arg1, arg2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void test_Addition_Of_Negative_And_Zero_Numbers() {

        final BigDecimal arg1 = BigDecimal.valueOf(-1);
        final BigDecimal arg2 = BigDecimal.valueOf(0);
        final BigDecimal expectedResult = BigDecimal.valueOf(-1);

        BigDecimal result = serviceUnderTest.add(arg1, arg2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void test_Addition_Of_Negative_And_Positive_Numbers_WithExpected_Zero_Result() {

        final BigDecimal arg1 = BigDecimal.valueOf(-5);
        final BigDecimal arg2 = BigDecimal.valueOf(5);
        final BigDecimal expectedResult = BigDecimal.valueOf(0);

        BigDecimal result = serviceUnderTest.add(arg1, arg2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void test_Addition_Of_Negative_And_Positive_Numbers_WithExpected_Positive_Result() {

        final BigDecimal arg1 = BigDecimal.valueOf(-5);
        final BigDecimal arg2 = BigDecimal.valueOf(8);
        final BigDecimal expectedResult = BigDecimal.valueOf(3);

        BigDecimal result = serviceUnderTest.add(arg1, arg2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void test_Addition_Of_Negative_And_Positive_Numbers_WithExpected_Negative_Result() {

        final BigDecimal arg1 = BigDecimal.valueOf(-8);
        final BigDecimal arg2 = BigDecimal.valueOf(5);
        final BigDecimal expectedResult = BigDecimal.valueOf(-3);

        BigDecimal result = serviceUnderTest.add(arg1, arg2);

        assertEquals(expectedResult, result);
    }
}
