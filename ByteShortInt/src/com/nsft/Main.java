package com.nsft;

public class Main {

    public static void main(String[] args) {

        // INT HAS A WIDTH OF 32
        int myMinIntValue = -2147483648; // THIS IS THE MINIMUN NUMBER THAT AN INTEGER VALUE CAN HOLD
        int myMaxIntValue = 2147483647; // THIS IS THE MAXIMUN NUMBER THAT AN INTEGER VALUE CAN HOLD
        int myTotal = (myMinIntValue / 2);
        System.out.println("My Total: " + myTotal);

        // BYTE HAS A WIDTH OF 8
        byte myMinByteValue = -128; // THE SMALLEST NUMBER FOR A BYTE '-128'
        byte myMaxByteValue = 127; // THE BIGGEST NUMBER FOR A BYTE
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println("My Byte Total: " + myNewByteValue);

        // SHORT HAS A WIDTH OF 16
        short myMinShort = -32768; // THE MIN NUMBER FOR A SHORT
        short myMAXShort = 32767; // THE MAX NUMBER FOR A SHORT
        short myNewShortValue = (short) (myMinShort / 2);
        System.out.println("My Short Total: " + myNewShortValue);

        // LONG HAS A WIDTH OF 64
        long myMaxLongValue = 100L; // THE MAX NUMBER FOR A VARIBALE TOO LONG 18 NUMBERS (?)


        // CHALLENGE

        // 1.
        byte byteNum = 32;

        // 2.
        short shortNum = 302;

        // 3.
        int intNum = 16;
        // 4.
        long totalResult = 50000L + 10 L* ( byteNum + shortNum + intNum);

        System.out.println("Result: " + totalResult);


    }
}
