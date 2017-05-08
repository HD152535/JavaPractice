package org.dimigo.inheritance;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person("Tom");
		System.out.println(p);
		
		Korean k = new Korean("홍길동");
		System.out.println(k);
		
		Japanese j = new Japanese("다나까");
		System.out.println(j);
		
		Chinese c = new Chinese("왕밍");
		System.out.println(c);
		
		System.out.println();
		
		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		
		System.out.println();
		
		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();
		
		
	}

}
