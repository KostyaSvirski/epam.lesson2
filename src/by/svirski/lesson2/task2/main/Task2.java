package by.svirski.lesson2.task2.main;

import by.svirski.lesson2.task2.service.Service;

public class Task2 {

	public static void main(String[] args) {
			
		if(Service.checkIsEmpty(args)) {
			Service.printReverseInput(args);			
		} else {
			System.out.println("empty input");
		}
	}

}
