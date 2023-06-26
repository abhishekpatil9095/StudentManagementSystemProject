package com.main;

import java.util.Scanner;

import com.controller.StudentController;
import com.service.NotFoundException;

public class StudentManagementSystem {

	public static void main(String[] args) {
		
		StudentController st= new StudentController();
		Scanner sc= new Scanner(System.in);	
		System.out.println("Welcome to student management systems \n Enter the below choice to perform operation");
		System.out.println("==============================================================");
		char ch;
		do {
			System.out.println("1. Add student");
			System.out.println("2. Delete student");
			System.out.println("3. Display all list of student");
			System.out.println("4. Display student by course name");
			System.out.println("5. Search student by name");
			
			System.out.println("enter a choice");
			int choice= sc.nextInt();
			
			switch(choice)
			{
			case 1:
				st.operation(choice);
				break;
			case 2:
				st.operation(choice);
				break;
			case 3:
				st.operation(choice);
				break;
			case 4:
				st.operation(choice);
				break;
			case 5:
				st.operation(choice);
				break;
			default:
				System.out.println("invalid choice please try again later");
			}
			System.out.println("do you want to continue Y/N");
			ch= sc.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		System.out.println("Thank you!");
	}
}
