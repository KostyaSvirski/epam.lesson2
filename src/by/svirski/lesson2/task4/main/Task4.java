package by.svirski.lesson2.task4.main;

import by.svirski.lesson2.task4.entity.Password;
import by.svirski.lesson2.task4.service.ServiceForPasswords;

public class Task4 {

	public static void main(String[] args) {
		if(args.length>=2) {
			Password password = new Password(args[0]);
			ServiceForPasswords.AuthentificationUser(args[1], password);
		} else {
			System.out.println("not enough data!");
		}
	}

}
