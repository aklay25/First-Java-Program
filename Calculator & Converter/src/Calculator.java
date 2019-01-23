import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculator {

	public static double addition(double x, double y) {
		return x + y;
	}

	public static double subtraction(double x, double y) {
		return x - y;
	}

	public static double multiplication(double x, double y) {
		return x * y;
	}

	public static double division(double x, double y) {
		return x / y;
	}

	public double firstNumber() {
		double a = Double.parseDouble(JOptionPane.showInputDialog("What is your first number"));
		return a;
	}

	public double secondNumber() {
		double b = Double.parseDouble(JOptionPane.showInputDialog("What is your second number"));
		return b;
	}

}