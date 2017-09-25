package com.dao.daoImpl;

import java.util.Scanner;

public class MyTest {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImplementation();
		//ud.insert();
		
		
		System.out.println("waa re wa");
		System.out.println("fetch");
		
		
		
		//ud.retrieve();
		
		
		Scanner input = new Scanner(System.in);
		
		//System.out.println("enter user id to delete");
		//long id= input.nextLong();
		//ud.delete(id);
		
		System.out.println("enter the user id to update");
		long userid = input.nextLong();
		
		System.out.println("enter the type");
		String usertype = input.next();
		
		ud.update(userid, usertype);
	}
}
