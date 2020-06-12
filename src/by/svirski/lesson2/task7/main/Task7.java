package by.svirski.lesson2.task7.main;

import by.svirski.lesson2.task7.service.CheckBirthdayService;

public class Task7 {

	public static void main(String[] args) {
		if(args.length >= 3) {
			try {
				CheckBirthdayService.calculateInfoAboutBirthday(args);
			} catch(NumberFormatException e) {
				System.out.println("incorrect input of date!");
			}
		} else {
			System.out.println("not enough data!");
		}

	}

}
