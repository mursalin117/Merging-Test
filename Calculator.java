import java.util.*;

/*
Simple program:
	-> Add two numbers.
	-> Subtract two numbers.
*/
public class Calculator{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b;
		a = in.nextDouble();
		b = in.nextDouble();
        System.out.println(sum(a, b));
        System.out.println(sub(a, b));
        System.out.println(mul(a, b));
        System.out.println(div(a, b));
	}
	static double sum(double a, double b) {
		return a + b;
	}
	static double sub(double a, double b) {
		return a - b;
	}

	static double mul(double a, double b) {
		return a * b;
    }

	static double div(double a, double b) {
		return a / b;
    }
}
