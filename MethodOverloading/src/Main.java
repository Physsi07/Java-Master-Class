public class Main {

	public static void main(String[] args){

		int newScore = calculateScore("Starlyn", 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore();
		calcFeetAndInchesToCentimeters(0,1);
		calcFeetAndInchesToCentimeters(157);
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points" );
		return  score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("Unnamed player score " + score + " points" );
		return  score * 1000;
	}

	public static int calculateScore() {
		System.out.println("No player name, no player score");
		return  0;
	}


	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

		double centimeters;

		if(!(feet >= 0)) {
			System.out.println("Feet is less than 0");
			return -1;
		}

		if(!(inches >= 0 && inches <= 12)){
			System.out.println("Inches is not in the valid range");
			return -1;
		}

		centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;

		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
		return centimeters;
	}

	public static double calcFeetAndInchesToCentimeters(double inches){


		if(!(inches >= 0)){
			System.out.println("Invalid inches");
			return -1;
		}

		double feet = (int) (inches / 12);
		double remainingInches = (int) inches % 12;

		System.out.println(inches + " inches = " + feet + " feet and " + remainingInches);

		return calcFeetAndInchesToCentimeters(feet, remainingInches);


	}


}
