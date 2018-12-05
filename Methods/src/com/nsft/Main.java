package com.nsft;

public class Main {

	public static void main(String[] args) {
		int highScore = calculateScore(true, 800, 100, 5);
		System.out.println("Your final score was " + highScore);
		calculateScore(false, 10000, 200, 8);

		// CHALLENGE
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Starlyn", highScorePosition);


		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Bob", highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Percy", highScorePosition);

		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Gilbert", highScorePosition);

		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Luis", highScorePosition);

		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Carol", highScorePosition);

		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Kevin", highScorePosition);
	}

	public static int calculateScore(boolean gameOver, int score, int bonus, int levelCompleted) {

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}

		return -1;
	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " managed to get into position "
				+ highScorePosition + " on the high score table");
	}

	public static int calculateHighScorePosition(int playerScore) {

//    	if (playerScore >= 1000) {
//    		return 1;
//		} else if (playerScore >= 500) {
//    		return 2;
//		} else if (playerScore >= 100) {
//    		return  3;
//		}
//
//		return 4;
		int position = 4;
		if (playerScore >= 1000) {
			position = 1;
		} else if (playerScore >= 500) {
			position = 2;
		} else if (playerScore >= 100) {
			position = 3;
		}

		return position;
	}

}
