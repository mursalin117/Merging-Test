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
		double c = sum(a, b);
				
	}
	double sum(double a, double b) {
		return a + b;
	}
	double sub(double a, double b) {
		return (a - b);
	}
}
