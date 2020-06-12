package by.svirski.lesson2.task4.service;

import by.svirski.lesson2.task4.entity.Password;

public class ServiceForPasswords {

	public static void AuthentificationUser(String userInput, Password password) {

		if (userInput.equals(password.getPassword())) {
			System.out.println("password accepted");
		} else {
			System.out.println("password is not accepted");
		}
	}

}
