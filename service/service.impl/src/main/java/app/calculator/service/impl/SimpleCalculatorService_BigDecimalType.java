package app.calculator.service.impl;

import app.calculator.service.api.ISimpleCalculatorService_BigDecimalType;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class SimpleCalculatorService_BigDecimalType implements ISimpleCalculatorService_BigDecimalType {

    // ... constants

    private static final MathContext DEFAULT_MATH_CONTEXT = new MathContext(12, RoundingMode.HALF_UP);

    // ... properties

    private final MathContext mathContext;

    // ... constructors

    public SimpleCalculatorService_BigDecimalType() {

        this.mathContext = DEFAULT_MATH_CONTEXT;
    }

    public SimpleCalculatorService_BigDecimalType(final MathContext mathContext) {

        this.mathContext = mathContext;
    }

    // ... business methods

    @Override
    public BigDecimal neg(BigDecimal arg) {

        return arg.negate();
    }

    // ...

    @Override
    public BigDecimal add(BigDecimal arg1, BigDecimal arg2) {

        return arg1.add(arg2, mathContext);
    }

    @Override
    public BigDecimal div(BigDecimal arg1, BigDecimal arg2) {

        return arg1.divide(arg2, mathContext);
    }

    @Override
    public BigDecimal mul(BigDecimal arg1, BigDecimal arg2) {

        return arg1.multiply(arg2, mathContext);
    }

    @Override
    public BigDecimal sub(BigDecimal arg1, BigDecimal arg2) {

        return arg1.subtract(arg2, mathContext);
    }

}
