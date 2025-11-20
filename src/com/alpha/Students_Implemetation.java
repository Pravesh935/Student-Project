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
		  //add implementation
		
	 }

	 @Override
	 public void Update() {
		// TODO Auto-generated method stub
		 System.out.println("enter id to update");
		 int id=sc.nextInt();
		 System.out.println("enter age");
		 int age=sc.nextInt();
		 for(Student s:list) {
			 if(s.getId()==id) {
				 s.setAge(age);
				 System.out.println(" age updated");
			 }
			 else {
				 System.out.println("not found");
			 }
		 }
		
	 }
	 @Override
	 public Student FindStudent() {
		 System.out.println("enter  student id");
		 int id=sc.nextInt();
		 
		 for(Student s:list) {
			 if(s.getId()==id)
				 System.out.println("Student found");
			     System.out.println(s);
				 return s;
		 }
		 System.out.println("not found");
		 return null;
		 
	 }

	 

}
