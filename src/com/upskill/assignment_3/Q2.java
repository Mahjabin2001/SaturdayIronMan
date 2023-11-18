package com.upskill.assignment_3;

public class Q2 {

	String name;
	int age;
	String salary;
	String address;

	public Q2(String name, int age, String salary, String address) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;

	}

	public static void main(String[] args) {
		Q2 obj = new Q2("Sara, ", 22, " 120k,", " 123 8th ave");
		System.out.println((obj.name) + obj.age + "," + obj.salary + obj.address);

		Q2 obj1 = new Q2("Zara, ", 23, " 140k,", " 123 8th ave");
		System.out.println((obj1.name) + obj1.age + "," + obj1.salary + obj1.address);

		Q2 obj2 = new Q2("Kara, ", 37, " 90k,", " 408 9th ave");
		System.out.println((obj2.name) + obj2.age + "," + obj2.salary + obj2.address);

		Q2 obj3 = new Q2("Nora, ", 55, " 200k,", " 123 10th ave");
		System.out.println((obj3.name) + obj3.age + "," + obj3.salary + obj3.address);

		Q2 obj4 = new Q2("Taha, ", 40, " 250k,", " 123 Dahil Rd");
		System.out.println((obj4.name) + obj4.age + "," + obj4.salary + obj4.address);

	}

}
