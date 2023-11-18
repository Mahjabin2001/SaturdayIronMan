package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method

	
		
		private String name = "Mim";
		private int ssn = 12345;
		private String username = "Mim12";

//setter method - name
		public void setName(String value) { //set the data, write
			name = value;
		}
		
		
		//getter method - name
		public String getName() {
			return name;
		}
		
		
		//set the data, ssn
		public void setSocial(int value) { 
			ssn = value;
		}
		
		
		//get the username, getter method
		public String getUserName() {   
			return username;
		}
		
		public static void main(String[] args) {
			Encapsulation obj = new Encapsulation();
			obj.setName("Tanhaaa");
			System.out.println(obj.getName());
		
			obj.setSocial(12345);
			System.out.println(obj.getUserName());
			
			
			
			
	}

}
