package com.alpha;

import java.util.Scanner;

public class Std_Controller {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Students_Implemetation si = new Students_Implemetation();
	
	boolean flag = true;
	
	while(flag) {
		
		System.out.println("Enter your choice!");
		System.out.println("1: Enter 1 to Add Students");
		System.out.println("2: Enter 2 to Delete Students");
		System.out.println("3: Enter 3 to Update Students");
		System.out.println("4: Enter 4 to Find Students by ID");
		System.out.println("5: EXIT ");
		
		int choice = sc.nextInt();
		switch(choice) {
		
		case 1: {
			System.out.println("Enter student ID: ");
			int id = sc.nextInt();
			
			System.out.println("Enter student Name:");
			String name = sc.next();
			
			System.out.println("Enter student Age:");
			int age = sc.nextInt();
			
			Student s = new Student(id, name, age);
			
			si.AddStudent(s);
			
			
			break;
		}
		
		
		case 2: {
			
			break;
		}
		
		
		case 3: {
			break;
		}
		
		
		case 4: {
			break;
		}
			
		}
		
		
	}
	
	
	
}
}
