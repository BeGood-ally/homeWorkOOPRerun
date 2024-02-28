package logging;

import services.ComplexNumber;

public class LogCalc implements LogCalculate{

    @Override
    public String viewAction() {
        return null;
    }

    @Override
    public String viewAction(ComplexNumber num1, ComplexNumber num2, ComplexNumber num3, String operation) {
        String strLog = "";
        if (operation.equals("1")) {
            strLog = "При сложении чисел " + num1.viewComplexNumber() + " и " + num2.viewComplexNumber() + " получилось: " + num3.viewComplexNumber();
            System.out.println(strLog);
        }
        else if(operation.equals("2")){
            strLog = "При умножении чисел " + num1.viewComplexNumber() + " и " + num2.viewComplexNumber() + " получилось: " + num3.viewComplexNumber();
            System.out.println(strLog);
        }
        else if(operation.equals("3")){
            strLog = "При делении числа " + num1.viewComplexNumber() + " на число " + num2.viewComplexNumber() + " получилось: " + num3.viewComplexNumber();
            System.out.println(strLog);
        }
        return strLog;
    }
}
