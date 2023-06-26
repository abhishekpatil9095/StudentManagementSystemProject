package com.controller;
import java.util.Scanner;

import com.service.NotFoundException;
import com.serviceImplementation.StudentServiceImplements;

public class StudentController {

	Scanner sc= new Scanner(System.in);
	private StudentServiceImplements stud;
	
	public StudentController()
	{
		this.stud= new StudentServiceImplements();
	}
	
	public void operation(int option)
	{
		switch(option)
		{
		case 1:
			stud.add();
			break;
		case 2:	
			try
			{
			stud.delete();
			}
			catch(NotFoundException n)
			{
				n.getMessage();
			}
			break;
		case 3:
			stud.display();
			break;
		case 4:
			try
			{
				stud.displayByCourse();
			}
			catch(NotFoundException a)
			{
				a.getMessage();
			}
			break;
		case 5:
			try
			{
				stud.searchByName();
			}
			catch(NotFoundException b)
			{
				b.getMessage();
			}
			break;
		default:
			System.out.println("invalid choice");
		}
		
	}
}
