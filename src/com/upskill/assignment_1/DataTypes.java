package com.upskill.assignment_1;

public class DataTypes {

	public static void main(String[] args) {
	
	//Q1
		int a = 5;
		int b = 7;
		int c = 11;
		
		System.out.println("Permiter of the triangle = "  + (a+b+c) );
		
	
	//Q2
		
		int w = 9;
		int l = 13;
		int perimeter = 2*(l+w);
		System.out.println("Perimeter of rectangle = " + perimeter );
		
		
		
		DataTypes obj = new DataTypes();  //creating object
		
		//System.out.println("The addition of x + y + function returns value is  "+obj.multiply()); //Q3
		
		int q = 9;
		int r = 11;
		int theResult = obj.multiply(q, r);
		System.out.println(q + r + theResult); // Q3

		obj.student1(); // Q5
		student2(); // Q5
		System.out.println("The name and age of studentt 3 is " + obj.student3()); // Q5

		System.out.println("The larger number - the samller number is " + (obj.function2() - obj.function1())); // Q4

	}

	
	
//Q3
public int multiply(int q, int r) {
	return q*r;
	
}





//Q5


public void student1() {
	String name = "Tanha ";
	int age = 23;
	System.out.println("The name and age of studentt 1 is "+name+age);
	
}

public static void student2() {
	String name = "Mim ";
	int age = 22;
	System.out.println ("The name and age of studentt 2 is "+name + age);
	
}
	
public String student3() {
	int age = 22;
	String name = "Sumaiya ";
	return name+age;
	
	
	
}

//Q4

public int function1() {
	return 30;
	
}

public int function2() {
	return 50;
}

}
	
	
	
	
	
	

