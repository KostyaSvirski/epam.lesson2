package by.svirski.lesson2.task3.main;

import by.svirski.lesson2.task3.service.ServiceForRandomNumbers;

public class Task3 {

	public static void main(String[] args) {

		if (args.length >= 2) {
			ServiceForRandomNumbers.createCertainRandomNumber(args[0], args[1]);
		} else {
			System.out.println("not enough data!");
		}

	}
}
