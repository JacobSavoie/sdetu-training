package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking.");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping.");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Instantiate an object
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "123456789";
		
		// Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Sara";
		
		person2.walk();
		
		
		
		/*
		//Person-
		
		//Attributes
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "1234567891";
		
		//Action, activity, behavior
		walking(name);
		
		//What is we wanted to do this for another person
		
		//Attributes
		String name2 = "Sara";
		String email2 = "sara@testemail.com";
		String phone2 = "1234567891";
			
		//Action, activity, behavior
		walking(name2);
		
		// What about binding attributes and behavior together
		
	}
	
	//Enhance w functions to minimize repetitive code
	static void walking(String name) {
		System.out.println(name + " is walking");
	*/
	}
	
}
