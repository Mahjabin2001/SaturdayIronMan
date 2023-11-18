package com.upskill.java_5;

public abstract class AbstractClass {
	
	//Interface can have only abstract methods, java 8 and forward they have static method too
	
		//Abstract method doesn't have any implementation
	
	
	
	
	
	//Abstract class has both abstract method and regular method
	
	public abstract void iDoor();  //always starts with i, i = interface
	public abstract String iengine();
	
	public abstract String iColor();
	public abstract int iWheel();
	
	

	public void car() {
		System.out.println("my car");
	}
	
}
