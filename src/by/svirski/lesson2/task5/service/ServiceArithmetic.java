package by.svirski.lesson2.task5.service;

public class ServiceArithmetic {

	public static int[] CreateArrayOfIntArguments(String[] args) throws NumberFormatException {

		int[] arrayOfNumbers = new int[args.length];
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			arrayOfNumbers[i] = Integer.parseInt(args[i]);
		}
		return arrayOfNumbers;

	}

	public static int calculateSum(int[] args) {
		int sum = 0;
		for (int i : args) {
			sum += i;
		}
		return sum;
	}

	public static void printResults(int sum) {
		System.out.printf("sum is %s%n", sum);
	}
}
