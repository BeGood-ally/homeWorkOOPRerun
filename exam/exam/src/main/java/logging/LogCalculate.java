package logging;

import services.ComplexNumber;

public interface LogCalculate {
    public String viewAction();

    String viewAction(ComplexNumber num1, ComplexNumber num2, ComplexNumber num3, String operation);
}
