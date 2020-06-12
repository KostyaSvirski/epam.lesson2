package by.svirski.lesson2.task2.service;

import java.util.StringJoiner;

public class Service {

	public static void printReverseInput(String[] args) {
		StringJoiner joiner = new StringJoiner(" ");
		for (int i = args.length - 1; i >= 0; i--) {
			joiner.add(args[i]);
		}
		System.out.println(joiner.toString());
	}

	public static boolean checkIsEmpty(String[] args) {
		if (args.length == 0) {
			return false;
		} else {
			return true;
		}
	}
}
