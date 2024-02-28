package services;

public class ComplexCalculator {
    ComplexNumber num1;
    ComplexNumber num2;
    String operation;

    public ComplexCalculator(ComplexNumber num1, ComplexNumber num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public ComplexNumber action(ComplexNumber num1, ComplexNumber num2, String operation){
        Double r = 0.0; Double i = 0.0;
        if(operation.equals("1")){
            r = num1.getRealPart() + num2.getRealPart();
            i = num1.getIllusoryPart() + num2.getIllusoryPart();
        }
        else if(operation.equals("2")){
            r = (num1.getRealPart() * num2.getRealPart()) + (num1.getIllusoryPart() * num2.getIllusoryPart() * -1);
            i = (num1.getRealPart() * num2.getIllusoryPart()) + (num1.getIllusoryPart() * num2.getRealPart());
        }
        return new ComplexNumber(r,i);
    }
    public ComplexNumber actionClasses(ComplexNumber num1, ComplexNumber num2, String operation) {
        ComplexNumber numResult = null;
        if (operation.equals("1")) {
            CalcSummation summ = new CalcSummation(num1, num2);
            numResult = summ.summationEnter(num1, num2);
        }
        else if(operation.equals("2")){
            CalcMultiplication mult = new CalcMultiplication(num1, num2);
            numResult = mult.multiplicationEnter(num1, num2);
        }
        else if(operation.equals("3")){
            CalcDivision div = new CalcDivision(num1, num2);
            numResult = div.divisionEnter(num1, num2);
        }
        return numResult;
    }

}
