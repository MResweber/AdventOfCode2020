package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utilities {

	public static String[] readInput() {
		try {
			File inputFile = new File("src/day2/input");
			Scanner inputScanner = new Scanner(inputFile);
			String input = "";
			while (inputScanner.hasNext()) {
				input += inputScanner.nextLine() + ",";
			}
			inputScanner.close();
			return input.split(",");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
