package day02;

import utilities.Utilities;

public class CheckPassSled {

	public static void main(String[] args) {
		int valid = 0;
		String[] input = Utilities.readInput();
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
}
