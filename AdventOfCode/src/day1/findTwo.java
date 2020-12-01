package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class findTwo {

	public static void main(String[] args) {
		int[] values = getInput();
		for (int i = 0; i < values.length; i++) {
			for (int y = i + 1; y < values.length; y++) {
				if (values[i] + values[y] == 2020) {
					System.out.println(values[i] * values[y]);
				}
			}
		}
	}

	public static int[] getInput() {
		File inputFile = new File("src/day1/input");
		try {
			Scanner inputRead = new Scanner(inputFile);
			String inputString = "";
			while (inputRead.hasNext()) {
				inputString += inputRead.nextLine() + ",";
			}
			String[] inputStringArray = inputString.split(",");
			int[] finalArray = new int[inputStringArray.length];
			for (int i = 0; i < inputStringArray.length; i++) {
				finalArray[i] = Integer.parseInt(inputStringArray[i]);
			}
			inputRead.close();
			return finalArray;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
