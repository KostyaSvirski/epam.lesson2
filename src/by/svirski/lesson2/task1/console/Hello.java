package by.svirski.lesson2.task1.console;

import by.svirski.lesson2.task1.name.NameFromInput;
import by.svirski.lesson2.task1.service.ServiceForInput;

public class Hello {

	public static void main(String[] args) {
		
		NameFromInput inputName = new NameFromInput();
		if(ServiceForInput.checkInput(args)) {
			inputName.setName(args[0]);
		} else {
			System.out.println("empty name!");
			return;
		}
		
		ServiceForInput.printHelloName(inputName.getName());
		
	}

}
