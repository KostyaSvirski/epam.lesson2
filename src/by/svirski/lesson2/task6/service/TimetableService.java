package by.svirski.lesson2.task6.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimetableService {
	
	public static Date calculateDeadline(String days) throws NumberFormatException{
		int parsedDays = Integer.parseInt(days);
		Calendar deadline = new GregorianCalendar();
		deadline.add(Calendar.DAY_OF_MONTH, parsedDays);
		return deadline.getTime();
	}
	
	public static void printDeadlineAndDeveloper(String developer, Date deadline) {
		System.out.printf("Developer: %s%nDeadline: %s%n", developer, deadline);
	}
}
