package com.nsft;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;

        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        // width of int = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        // Challenge (Convert a given number of pounds to kilograms)
        // NOTES - 1 pund is equal to 0.45359237 kilograms

        // 1.
        double numOfPounds = 200d;

        // 2.
        double convertedKilograms = numOfPounds * 0.45359237d;

        System.out.println(numOfPounds + " pounds is " + convertedKilograms + " kilograms");

    }
}
