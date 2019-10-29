package com.wyischina.oop;

public class ComplexNumber {
    private double a;
    private double b;

    public ComplexNumber(){
        this.a = 0;
        this.b = 0;
    }

    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }

    public ComplexNumber add(ComplexNumber another) {
        return new ComplexNumber(a + another.a, b + another.b);
    }

    public ComplexNumber subtract(ComplexNumber another) {
        return new ComplexNumber(a - another.a, b - another.b);
    }
    public ComplexNumber multiply(ComplexNumber another) {
        return new ComplexNumber((a * another.a) - (b * another.b), (a * another.b) + (b * another.a));
    }

    public ComplexNumber divide(ComplexNumber another) {
        double d = Math.pow(another.a, 2) + Math.pow(another.b, 2);
        return new ComplexNumber(((a * another.a) - (b * (another.b)))/d, (b * another.a) + (a * (another.b))/d);
    }

    public ComplexNumber addReal(int real) {
        return new ComplexNumber(a + real, b);
    }

    public ComplexNumber subtractReal(int real) {
        return new ComplexNumber((a - real), b);
    }

    public ComplexNumber multiplyReal(int real) {
        return new ComplexNumber(a * real, b * real);
    }

    public ComplexNumber divideReal(int real) {
        return new ComplexNumber(a/real, b/real);
    }

    public double getReal(){
        return this.a;
    }

    public double getImaginary(){
        return this.b;
    }

    public boolean equals(Object object){
        ComplexNumber x = (ComplexNumber) object;
        if (a == x.a && b == x.b) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "("+a+","+b+"i)";
    }

    public String getConjugate() {
        return "("+a+","+(-b)+"i)";
    }
}