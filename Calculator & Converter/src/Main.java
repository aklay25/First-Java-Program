import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	
	public static void menuOption(int menuInput ) {
		
		String[] menu = {"1. Basic Calculator", " 2. Basic Converter"};
		JOptionPane.showMessageDialog(null, menu);
		int menuOption = Integer.parseInt(JOptionPane.showInputDialog("What is your choice?"));
		Calculator obj = new Calculator();
		Convertor obj1 = new Convertor();
		
		if (menuOption == 1) {
			String[] menu1 = { "1. Addition", "2. Subtraction", "3.Multiplication", "4. Division" };
			JOptionPane.showMessageDialog(null, menu1);
			int menuOption1 = Integer.parseInt(JOptionPane.showInputDialog("What is your choice?"));
			if (menuOption1 == 1) {
				double x = obj.firstNumber();
				double y = obj.secondNumber();
				JOptionPane.showMessageDialog(null, "Equals: " + obj.addition(x, y));
			}else if (menuOption1 == 2) {
				double x = obj.firstNumber();
				double y = obj.secondNumber();
				JOptionPane.showMessageDialog(null, "Equals: " + obj.subtraction(x, y));
				
			}else if (menuOption1 == 3) {
				double x = obj.firstNumber();
				double y = obj.secondNumber();
				JOptionPane.showMessageDialog(null, "Equals: " + obj.multiplication(x, y));
				
			}else if (menuOption1 == 4) {
				double x = obj.firstNumber();
				double y = obj.secondNumber();
				JOptionPane.showMessageDialog(null, "Equals: " + obj.division(x, y));
				
			}
			
		}else if (menuOption == 2) {
			String[] menu2 = {"1. Convert kmh ->  ms", "2. Convert ms -> kmh", "3. Convert Farenheight to Celcius", "4. Convert Celcius to Farenheit"};
			JOptionPane.showMessageDialog(null, menu2);
			int menuOption2 = Integer.parseInt(JOptionPane.showInputDialog("What is your choice?"));
			if (menuOption2 == 1) {
				double x = obj1.firstNumber();
				double ms = 0;
				JOptionPane.showMessageDialog(null, "Equals: " + obj1.distanceConverter1(x, ms));
				
			}else if(menuOption2 == 2) {
				double x = obj1.firstNumber();
				double kmh = 0;
				JOptionPane.showMessageDialog(null, "Equals: " + obj1.distanceConverter2(x, kmh));
			
			}else if(menuOption2 == 3) {
				double x = obj1.firstNumber();
				double celc = 0;
				JOptionPane.showMessageDialog(null, "Equals: " + obj1.heatConverter1(x, celc));
			
			}else if(menuOption2 == 3) {
				double x = obj1.firstNumber();
				double faren = 0;
				JOptionPane.showMessageDialog(null, "Equals: " + obj1.heatConverter2(x, faren));
			}
			
		}

		
	}
	
	public static void main(String[] args) {
		menuOption(0);
	}

}