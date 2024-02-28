package services;

public class ComplexNumber {
     Double realPart;
     Double illusoryPart;

    public ComplexNumber(Double realPart, Double illusoryPart) {
        this.realPart = realPart;
        this.illusoryPart = illusoryPart;
    }

    public Double getRealPart() {
        return realPart;
    }

    public Double getIllusoryPart() {
        return illusoryPart;
    }

    public String viewComplexNumber() {
        return Double.toString(realPart) + " + " + Double.toString(illusoryPart) + "i";
    }
}
