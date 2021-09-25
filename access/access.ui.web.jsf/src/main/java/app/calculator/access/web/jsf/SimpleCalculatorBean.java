package app.calculator.access.web.jsf;

import app.calculator.access.ui.common.SimpleCalculatorViewController;
import app.calculator.access.ui.common.type.EMathOperation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "simpleCalculatorBean")
@SessionScoped
public class SimpleCalculatorBean extends SimpleCalculatorViewController {

    // ... business methods

    public void setDisplayValue(final String displayValue) {
    }

    public void selectMathOperation(final String mathOperation) {

        this.selectMathOperation(EMathOperation.valueOf(mathOperation));
    }
}