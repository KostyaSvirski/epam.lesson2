package by.svirski.lesson2.task3.service;

import java.util.Random;
import java.util.StringJoiner;

public class ServiceForRandomNumbers {
	
	public final static String NEW_LINE = "yes";
	public final static String PRESENT_LINE = "no";

	public static void createCertainRandomNumber(String number, String format) {
		Random random = new Random();
		int sizeOfArray;
		try {
			sizeOfArray = Integer.parseInt(number);
			int[] randomNumbers = new int[sizeOfArray];
			for (int i = 0; i < randomNumbers.length; i++) {
				randomNumbers[i] = random.nextInt(10);
			}
			checkForFormat(randomNumbers, format);
		} catch (NumberFormatException e) {
			System.out.println("not valid number");
		}
		
	}
	
	private static void checkForFormat(int[] numbers, String format) {
		if(format.equalsIgnoreCase(NEW_LINE)) {
			print(numbers, "\n");
		} else if(format.equalsIgnoreCase(PRESENT_LINE)) {
			print(numbers, "\t"); 
		}
		else {
			System.out.println("incorrect input of format");
		}
	}
	
	private static void print(int[] numbers, String param) {
		StringJoiner joiner = new StringJoiner(param);
		for(int i : numbers) {
			joiner.add(Integer.toString(i));
		}
		System.out.println(joiner.toString());
	}
}
