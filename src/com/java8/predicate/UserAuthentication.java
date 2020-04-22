package com.java8.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

import com.java8.predicate.model.User;

public class UserAuthentication {

	public static void main(String[] args) {
		Predicate<User> p = user -> user.userName.equals("Durga") && user.password.equals("Classes");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name:");
		String username = sc.next();
		System.out.println("Enter password:");
		String password = sc.next();
		sc.close();
		User user = new User(username, password);
		if(p.test(user))
		{
			System.out.println("Valid user"); 
				
		}
		else
		{
			System.out.println("InValid user/password"); 
				
		}
	}

}
