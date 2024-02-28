package services;

public class CalcSummation {
    ComplexNumber num1;
    ComplexNumber num2;

    public CalcSummation(ComplexNumber num1, ComplexNumber num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public ComplexNumber summationEnter(ComplexNumber num1, ComplexNumber num2) {
        Double r = 0.0;
        Double i = 0.0;
        Double r1 = num1.getRealPart();
        Double r2 = num2.getRealPart();
        Double i1 = num1.getIllusoryPart();
        Double i2 = num2.getIllusoryPart();
        r = r1 + r2;
        i = i1 + i2;
        return new ComplexNumber(r, i);
    }
}
