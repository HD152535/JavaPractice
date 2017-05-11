package org.dimigo.inheritance;

public class PersonTest2 {

	public static void main(String[] args) {

		Person[] persons = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나까"),
				new Chinese("왕밍") 
				};
		
		for(Person person:persons){
			greeting(person);
			System.out.println();
			
		}
		
		
	}
	
	private static void greeting(Person person){
		System.out.println(person);
		person.sayHello();
		person.sayBye();
	}
	
		

}
