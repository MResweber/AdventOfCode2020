package day02;

import utilities.Utilities;

public class CheckPassToboggan {

	public static void main(String[] args) {
		int valid = 0;
		String[] input = Utilities.readInput();
		for (int i = 0; i < input.length; i++) {
			int dashIndex = input[i].indexOf("-");
			int spaceIndex = input[i].indexOf(" ");
			int colonIndex = input[i].indexOf(":");
			
			int pos1 = Integer.parseInt(input[i].substring(0, dashIndex));
			int pos2 = Integer.parseInt(input[i].substring(dashIndex + 1, spaceIndex));
			char reqChar = input[i].charAt(spaceIndex + 1);
			
			if (input[i].substring(colonIndex + 1).charAt(pos1) == reqChar &&
					input[i].substring(colonIndex + 1).charAt(pos2) != reqChar) {
				valid++;
			}
			if (input[i].substring(colonIndex + 1).charAt(pos1) != reqChar &&
					input[i].substring(colonIndex + 1).charAt(pos2) == reqChar) {
				valid++;
			}
		}
		System.out.println(valid);
	}
}
