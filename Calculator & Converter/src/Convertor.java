import java.util.Scanner;

import javax.swing.JOptionPane;

public class Convertor {
	
	public static double distanceConverter1(double kmh, double ms) {
		ms = kmh / 3.6;
		return ms;	
	}
	public static double distanceConverter2(double kmh, double ms) {
		kmh = ms * 3.6;
		return kmh;
				
	}
	public static double heatConverter1(double faren, double celc) {
		celc = (faren - 32) / 1.8000;
		return celc;
	}
	public static double heatConverter2(double faren, double celc) {
		faren = (1.8000 * celc) + 32;
		return faren;
	}
	public double firstNumber() {
		double conversionNum = Double.parseDouble(JOptionPane.showInputDialog("What is the number you want to convert"));
		return conversionNum;
	}

}
