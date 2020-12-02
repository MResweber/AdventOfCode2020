package day01;

import utilities.Utilities;

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
			String[] inputStringArray = Utilities.readInput();
			int[] finalArray = new int[inputStringArray.length];
			for (int i = 0; i < inputStringArray.length; i++) {
			finalArray[i] = Integer.parseInt(inputStringArray[i]);
		}
		return finalArray;
	}
}
