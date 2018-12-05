package com.nsft;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
		System.out.println(previousResult + " - 1 = " + result);

		previousResult = result;
		result = result * 10;
		System.out.println(previousResult + " * 10 = " + result);

		previousResult = result;
		result = result / 5;
		System.out.println(previousResult + " / 5 = " + result);

		previousResult = result;
		result = result % 3;
		System.out.println(previousResult + " % 3 = " + result);

		previousResult = result;
		result = result + 1;
		System.out.println("Result is now " + result);
		result++;
		System.out.println("Result is now " + result);
		result--;
		System.out.println("Result is now " + result);
		result += 2;
		System.out.println("Result is now " + result);
		result -= 10;


		boolean isAlien = false;
		if(isAlien == true)
			System.out.println("It is not an alient!");

		int topScore = 80;
		if(topScore >= 100)
			System.out.println("You got the high score!");

		int secondTopScore = 60;
		if((topScore > secondTopScore) && (topScore < 100))
			System.out.println("Greater than top scppre and less then 100");

		if((topScore > 90) || (secondTopScore <= 90))
			System.out.println("One of this test is true");

		int newValue = 50;
		if(newValue == 50)
			System.out.println("This is true");

		boolean isCar = true;
		if(isCar)
			System.out.println("This is not supposed to happend");

		boolean wasCar = isCar ? true : false;
		if(wasCar)
			System.out.println("wasCar is true");

		// Challenge

		// 1.
		double firstDouble = 20d;

		// 2.
		double secDouble = 80d;

		// 3.
		double secResult = (firstDouble + secDouble) * 25;

		// 4.
		double remainder = (firstDouble + secDouble) % 40;

		// 5.
		if(remainder <= 20)
			System.out.println("Total was over the limit");
	}
}
