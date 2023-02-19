package _02_RecursionMath;

public class RecursionMath {

	public static int recursiveMultiplication(int number, int times) {
		// If times is 1
		if (times == 1) {
			// Return number
			return number;
		} else {
			// Else return number + recursiveMultiplication(number, times-1)
			return number + recursiveMultiplication(number, times - 1);
		}
	}

	// Try this one on your own!
	// Hint: if numberToDivideBy is bigger than number,
	// you can't divide anymore
	public static int recursiveDivision(int number, int numberToDivideBy) {
		if (number < numberToDivideBy) {
			return 0;
		} else {
			return 1 + recursiveDivision(number - numberToDivideBy, numberToDivideBy);

		}
	}

	// Try this one on your own!
	public static int recursivePower(int number, int power) {
		if (power == 0) {
			return 1;
		} else if (power == 1) {
			return number;
		} else {
			return number * recursivePower(number, power - 1);
		}

		// num = 3, power = 4
		// returns 3 * recursivePower(3,3)
		// 3 * recursivePower(3, 2)
		// 3 * recursivePower(3,1)
		// 3
	}
}
