package by.svirski.lesson2.task5.main;

import by.svirski.lesson2.task5.service.ServiceArithmetic;

public class Task5 {

	public static void main(String[] args) {
		if (args.length != 0) {
			try {
				int[] arrayOfParams = ServiceArithmetic.CreateArrayOfIntArguments(args);
				int sum = ServiceArithmetic.calculateSum(arrayOfParams);
				ServiceArithmetic.printResults(sum);
			} catch (NumberFormatException e) {
				System.out.println("incorrect input!");
			}

		} else {
			System.out.println("empty array!");
		}

	}

}
