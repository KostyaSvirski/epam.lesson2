package by.svirski.lesson2.task1.service;

public class ServiceForInput {

	public static boolean checkInput(String[] args) {
		if (args.length != 0) {
			if (!args[0].trim().isEmpty()) {
				return true;
			}
		} 
		return false;
	}
	
	public static void printHelloName(String name) {
		System.out.println("Hello, " + name);
	}

}
