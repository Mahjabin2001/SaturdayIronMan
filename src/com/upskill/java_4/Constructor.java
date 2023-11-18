package com.upskill.java_4;

public class Constructor {
	
	

	String studentName;
	int studentAge;
	
	public Constructor(String name) {
		studentName = name;
		
	}
	
	public Constructor (int age) {
		
		studentAge = age;
	}
	
	public Constructor(String name, int age) {
		studentName = name;
		studentAge = age;
		
	}
		
		
	
	
	public static void main(String[] args) {
		Constructor obj = new Constructor("Sara");
		System.out.println(obj.studentName);
		
		Constructor obj2 = new Constructor(30);
		System.out.println(obj2.studentAge);
		
		Constructor obj3 = new Constructor("Mim",22);
		System.out.println(obj3.studentName);
		System.out.println(obj3.studentAge);
	
		

	}

}
