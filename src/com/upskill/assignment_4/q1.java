package com.upskill.assignment_4;

public class q1 {

	private String username = "Mim2";
	@SuppressWarnings("unused")
	private String pass = "Mim123";
	private String email = "Mim123@gmail.com";
	private String firstN = "Mim";
	private String lastN = "Akhter";

	public static void main(String[] args) {

		q1 obj = new q1();
		System.out.println("Username: " + obj.getUsername());
		obj.setUsername("Mahjabin123");
		System.out.println("New useername is: " + obj.getUsername());
		obj.setPass("Mahjabin123");
		System.out.println("Email: " + obj.getEmail());
		obj.setEmail("Mahjabin@gmail.com");
		System.out.println("New email is: " + obj.getUsername());
		System.out.println("Full Name: " + obj.getFirstN() + " " + obj.getLastN());
		obj.setPass("12345");

	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the firstN
	 */
	public String getFirstN() {
		return firstN;
	}

	/**
	 * @param firstN the firstN to set
	 */
	public void setFirstN(String firstN) {
		this.firstN = firstN;
	}

	/**
	 * @return the lastN
	 */
	public String getLastN() {
		return lastN;
	}

	/**
	 * @param lastN the lastN to set
	 */
	public void setLastN(String lastN) {
		this.lastN = lastN;
	}

}
