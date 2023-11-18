package com.upskill.assignment_3;

public class Bank {

	double interest() {
		return 0.0;

	}

	class Chase extends Bank {
		double interest() {
			return .08;

		}
	}

	class City extends Bank {
		double interest() {
			return .07;

		}
	}

	class TD extends Bank {
		double interest() {
			return .09;

		}
	}

	public static void main(String[] args) {

		Bank obj = new Bank();
		Chase obj1 = obj.new Chase();

		City obj2 = obj.new City();
		TD obj3 = obj.new TD();

		System.out.println(obj1.interest());
		System.out.println(obj2.interest());
		System.out.println(obj3.interest());

	}

}
