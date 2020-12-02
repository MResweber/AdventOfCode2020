package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckPassSled {

	public static void main(String[] args) throws FileNotFoundException {
		int valid = 0;
		String[] input = readInput();
		for (int i = 0; i < input.length; i++) {
			int dashIndex = input[i].indexOf("-");
			int spaceIndex = input[i].indexOf(" ");
			int colonIndex = input[i].indexOf(":");
			
			int min = Integer.parseInt(input[i].substring(0, dashIndex));
			int max = Integer.parseInt(input[i].substring(dashIndex + 1, spaceIndex));
			char reqChar = input[i].charAt(spaceIndex + 1);
			int current = 0;
			for (int y = 0; y < input[i].substring(colonIndex + 1).length(); y++) {
				if (input[i].substring(colonIndex + 1).charAt(y) == reqChar) current++;
			}
			if (current >= min && current <= max) valid++;
		}
		System.out.println(valid);
	}
	
	public static String[] readInput() throws FileNotFoundException {
		File inputFile = new File("src/day2/input");
		Scanner inputScanner = new Scanner(inputFile);
		String input = "";
		while (inputScanner.hasNext()) {
			input += inputScanner.nextLine() + ",";
		}
		inputScanner.close();
		return input.split(",");
	}
}
