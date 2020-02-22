package com.company;

public class Main {

    public static void main(String[] args) {
        // two sets a and b that will be subtracted and added
        Complex a = new Complex (10, -8);
        Complex b = new Complex(-3, 4);

        Complex add_total = Complex.add_complex(a, b);
        Complex subtract_total = Complex.subtract_complex(a, b);

        //print function is used to print the total values
        add_total.print();
        subtract_total.print();
    }
}
