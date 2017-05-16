package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {

		SmartPhone[] smartphones = { 
				new IPhone("iPhone7", "애플", 900000), 
				new Galaxy("갤럭시 S8", "삼성", 800000) 
				};

		
		for (SmartPhone smartphone : smartphones) {
			smartphone.toString();
			smartphone.turnOn();
			smartphone.pay();
			smartphone.useSpecialFunction(smartphone);
			smartphone.turnOff();
			System.out.println();
		}

	}

}
