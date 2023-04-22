package Calculator;

public class MagicCalc extends Calculator {

	// squareroot
	public double squareRoot(double num1) {
		return Math.sqrt(num1);
	}

	// sin
	public double sin(double num1) {
		return Math.sin(num1);
	}

	// cos
	public double cos(double num1) {
		return Math.cos(num1);
	}

	// tan
	public double tan(double num1) {
		return Math.tan(num1);
	}

	// fac

	public int factorial(int num1) {
		return num1 * factorial(num1 - 1);
	}
}
