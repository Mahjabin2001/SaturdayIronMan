package com.upskill.java_5;

public class AbstractClassImplementtaion extends AbstractClass {

	@Override
	public void iDoor() {
		System.out.println("My car has 4 door ");
	}

	@Override
	public String iengine() {
		System.out.println("My car has dual engine ");

		return "Dual motor";
	}

	@Override
	public String iColor() {
		System.out.println("My car is red ");

		return "red";
	}

	@Override
	public int iWheel() {
		System.out.println("My car has 4 wheels ");

		return 4;
	}

}
