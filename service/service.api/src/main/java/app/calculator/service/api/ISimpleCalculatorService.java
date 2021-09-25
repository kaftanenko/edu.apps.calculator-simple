package app.calculator.service.api;

public interface ISimpleCalculatorService<DATA_TYPE> {

    // ... business methods

    DATA_TYPE neg(DATA_TYPE arg);

    // ...

    DATA_TYPE add(DATA_TYPE arg1, DATA_TYPE arg2);

    DATA_TYPE div(DATA_TYPE arg1, DATA_TYPE arg2);

    DATA_TYPE mul(DATA_TYPE arg1, DATA_TYPE arg2);

    DATA_TYPE sub(DATA_TYPE arg1, DATA_TYPE arg2);
}
