package com.company;

public class Complex {

    //instance variables:
    private final int real;
    private final int imaginary;

    //constructor
    public Complex (int realPart, int imaginaryPart) {
        this.real = realPart;
        this.imaginary = imaginaryPart; }

    //get method for real and imaginary number
    public int getreal() {return real;}
    public int getimaginary() {return imaginary;}

    //subtraction function
    public static Complex subtract_complex(final Complex a, final Complex b){
        int real_total = a.getreal() - b.getreal();
        int imaginary_total = a.getimaginary() - b.getimaginary();
        return new Complex(real_total, imaginary_total);
    }

    //addition function
    public static Complex add_complex(final Complex a, final Complex b){
        int real_total = a.getreal() + b.getreal();
        int imaginary_total = a.getimaginary() + b.getimaginary();
        return new Complex(real_total, imaginary_total);
    }

    //displays the values
    public void print(){
        System.out.println("Total Real Number = " + getreal() + ", Total Imaginary Number = " + getimaginary() + "i");
    }
}

