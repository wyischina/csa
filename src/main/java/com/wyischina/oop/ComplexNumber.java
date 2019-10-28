package com.wyischina.oop;

import org.jetbrains.annotations.NotNull;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber another){
        return new ComplexNumber(this.real + another.real, this.imaginary + another.imaginary);
    }

    public ComplexNumber add(double realNumber){
        return new ComplexNumber(this.real + realNumber, this.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber another){
        return new ComplexNumber((this.real*another.real)-(this.imaginary*another.imaginary), (this.imaginary*another.real)+(this.real*another.imaginary));
    }

    public ComplexNumber multiply(double realNumber){
        return new ComplexNumber(this.real*realNumber, this.imaginary*realNumber);
    }

    public ComplexNumber division(ComplexNumber another){
        try {
            return this.multiply(another.conjugate()).division(another.multiply(another.conjugate()).real);
        }catch(ArithmeticException e){
            System.out.println("cannot divide by zero.");
            return null;
        }
    }

    public ComplexNumber division(double realNumber){
        try{
        return new ComplexNumber(this.real/realNumber, this.imaginary/realNumber);
        } catch(ArithmeticException e){
            System.out.println("cannot divide by zero.");
            return null;
        }
    }

    public boolean equals(Object obj){
        ComplexNumber another = (ComplexNumber)obj;
        return this.real == another.real && this.imaginary == another.imaginary;
    }

    public String toString(){
        return "(" + this.real + " + " + this.imaginary + "i)";
    }

    public ComplexNumber conjugate(){
        return new ComplexNumber(this.real, -this.imaginary);
    }

    public PolarCoordinate polar(){
        double r = Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imaginary,2));
        double theda = Math.acos(this.real/r);
        return new PolarCoordinate(r, theda);
    }
}
