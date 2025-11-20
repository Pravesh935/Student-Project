package com.alpha;

import java.util.ArrayList;
import java.util.Scanner;

public class Students_Implemetation implements StudentOperation{
	Scanner sc= new Scanner(System.in);
	
	
	 ArrayList <Student> list = new ArrayList<>();

	

	 @Override
	 public void AddStudent() {
		 System.out.println("Enter student id");
		 int id=sc.nextInt();
		 System.out.println("Enter Student name");
		 String name=sc.next();
		 System.out.println("Enter student age");
		 int age= sc.nextInt();
		 Student student= new Student(id, name, age);
		 list.add(student);
		 System.out.println(list);
		 
		
	 }

	 @Override
	 public void Delete() {
		// TODO Auto-generated method stub
		
	 }

	 @Override
	 public void Update() {
		// TODO Auto-generated method stub
		
	 }
	 @Override
	 public Student FindStudent() {
		 return null;
		 
	 }

	 

}
