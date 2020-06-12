package by.svirski.lesson2.task7.service;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class CheckBirthdayService {

	public static final String CONGRATULATIONS = "Happy birthday!";
	public static final String NOT_CONGRATULATIONS = "sorry it's not your birthday";

	public static void calculateInfoAboutBirthday(String[] args) throws NumberFormatException {
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]) - 1;
		int day = Integer.parseInt(args[2]);

		Calendar presentDate = Calendar.getInstance();
		Calendar birthday = new GregorianCalendar(year, month, day);
		
		String dayOfBirth = calculateDay(birthday);
		int yearsOld = calculateAge(birthday, presentDate);
		String isBirthday = checkIsBirthday(birthday, presentDate);

		printResults(dayOfBirth, yearsOld, isBirthday);
	}

	private static void printResults(String dayOfBirth, int yearsOld, String isBirthday) {
		System.out.printf("day of birth: %s years old: %s is it your birthday? %s", dayOfBirth,
				Integer.toString(yearsOld), isBirthday);

	}

	private static String checkIsBirthday(Calendar birthday, Calendar presentDate) {
		if ((birthday.get(Calendar.DAY_OF_MONTH) == presentDate.get(Calendar.DAY_OF_MONTH))
				&& (birthday.get(Calendar.MONTH) == presentDate.get(Calendar.MONTH))) {
			return CONGRATULATIONS;
		} else {
			return NOT_CONGRATULATIONS;
		}
	}

	private static int calculateAge(Calendar birthday, Calendar presentDate) {
		int age = presentDate.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
		int monthesBetween = presentDate.get(Calendar.MONTH) - birthday.get(Calendar.MONTH);
		int daysBetween = presentDate.get(Calendar.DAY_OF_MONTH) - birthday.get(Calendar.DAY_OF_MONTH);

		if (monthesBetween < 0) {
			age -= 1;
		} else if (daysBetween < 0 && monthesBetween == 0) {
			age -= 1;
		}

		return age;
	}

	private static String calculateDay(Calendar birthday) {
		String dateOfBirth = birthday.getTime().toString();
		String dayOfBirth = dateOfBirth.substring(0, dateOfBirth.indexOf(" "));

		return dayOfBirth;
	}

}
