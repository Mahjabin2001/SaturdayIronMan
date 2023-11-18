package com.upskill.assignment_3;

public class DingDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ding();

	}

	public static void Ding() {
		int i;
		for (i = 0; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("DingDong");
			} else if (i % 3 == 0) {
				System.out.println("Ding");
			}else if (i % 5 == 0)
			{
				System.out.println("Dong");
			}else {
				System.out.println(i);
			}
		}
	}
}

