package com.upskill.java_1;

public class MethodType {
	
	
	
	/* Types of Methods
	 
	 1. Void method
	 2. Static method
	 3. Return type method
	  
	 */

	
	public static int hourlyIncome = 65;  //static: belongs to the class, because we do not create object
	
	
	public static void main(String[] args) {
		
		MethodType obj = new MethodType();  //creating object: className objectName = new ClassName();
		
		obj.annualIncomeVoid(); //creating method: objectName.methodName();
		
		System.out.println("My monthly income = " + obj.MonthlyIncomeReturn());
	 	
		weeklyIncomeStatic();
	}
	
	
	//void method, empty space , don't have to return any data
	public void annualIncomeVoid() {
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My annual income = " + calculateAnnualIncome);
	}

    //return type method	
	
	public int MonthlyIncomeReturn() {  //have to initialize what you will return
		int CalculateMonthlyIncome = hourlyIncome * 180;
		return CalculateMonthlyIncome;
	}
	
	
	//static method = do not have to create object, call directly
	public static void weeklyIncomeStatic() {
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My weekly income = " + calculateWeeklyIncome);
	}
}





