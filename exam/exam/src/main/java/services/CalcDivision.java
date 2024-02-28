package services;

public class CalcDivision {
    ComplexNumber num1;
    ComplexNumber num2;

    public CalcDivision(ComplexNumber num1, ComplexNumber num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public ComplexNumber divisionEnter(ComplexNumber num1, ComplexNumber num2){
        Double r = 0.0; Double i = 0.0;
        Double r1 = num1.getRealPart(); Double r2 = num2.getRealPart();
        Double i1 = num1.getIllusoryPart(); Double i2 = num2.getIllusoryPart();
        r = ((r1*r2)+(i1*i2))/(Math.pow(r2,2) + Math.pow(i2,2));
        i = ((r2*i1)-(r1*i2))/(Math.pow(r2,2) + Math.pow(i2,2));
        return new ComplexNumber(r,i);
    }
}
