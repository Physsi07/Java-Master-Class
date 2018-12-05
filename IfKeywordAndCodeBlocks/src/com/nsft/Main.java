package com.nsft;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int bonus = 100;
        int levelCompleted = 5;

        if (score < 5000 && score > 1000) {
        	System.out.println("Your score was in bettwen 1000 and 5000");
		} else if(score < 1000) {
			System.out.println("Your score is less than 1000");
		} else {
			System.out.println("Got here");
		}

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}


		// Challenge
		if (gameOver) {
			score = 10000;
			levelCompleted = 8;
			bonus = 200;

			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}




    }
}
