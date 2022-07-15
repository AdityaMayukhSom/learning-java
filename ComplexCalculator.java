public class ComplexCalculator {
    public static void main(String[] args) {
        // ComplexMath cm = new ComplexMath();
        ComplexNumber num1 = new ComplexNumber(4, 5);
        ComplexNumber num2 = new ComplexNumber(2, 3);

        ComplexNumber addNum = ComplexMath.add(num1, num2);
        ComplexNumber subtractNum = ComplexMath.subtract(num1, num2);
        ComplexNumber multiplyNum = ComplexMath.multiply(num1, num2);

        addNum.showComplexNumber();
        subtractNum.showComplexNumber();
        multiplyNum.showComplexNumber();
    }
}

class ComplexMath {
    // static methods can be used without initiating an object
    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = new ComplexNumber();
        result.setReal(num1.getReal() + num2.getReal());
        result.setImaginary(num1.getImaginary() + num2.getImaginary());
        return result;
    }

    // static methods can be used without initiating an object
    public static ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = new ComplexNumber();
        result.setReal(num1.getReal() - num2.getReal());
        result.setImaginary(num1.getImaginary() - num2.getImaginary());
        return result;
    }

    // static methods can be used without initiating an object
    public static ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = new ComplexNumber();
        result.setReal(num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary());
        result.setImaginary(num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal());
        return result;
    }
}

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void showComplexNumber() {
        String complexNumbeString = this.real + " + " + this.imaginary + "i";
        System.out.println(complexNumbeString);
    }
}
