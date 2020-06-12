package by.svirski.lesson2.task6.main;

import java.util.Date;

import by.svirski.lesson2.task6.service.TimetableService;

public class Task6 {

	public static void main(String[] args) {
		if (args.length >= 2) {
			try {
				Date deadline = TimetableService.calculateDeadline(args[1]);
				TimetableService.printDeadlineAndDeveloper(args[0], deadline);
			} catch (NumberFormatException e) {
				System.out.println("incorrect input of date");
			}
		} else {
			System.out.println("not enough data!");
		}
	}

}
