package com.cg.ui;

import java.util.Scanner;

public class AdminInterface {

	private static void adminLogin() {

		String uname = null, pass = null;
		Scanner console = new Scanner(System.in);
		System.out.println("Admin Login");
		System.out.println("Enter Username:");
		uname = console.nextLine();
		System.out.println("Enter Password:");
		pass = console.nextLine();

		if (uname.equals("admin") && pass.equals("123")) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login failed");
		}
		System.out.println("Programs Offered By University ");

		// TODO Auto-generated method stub

	}

}
