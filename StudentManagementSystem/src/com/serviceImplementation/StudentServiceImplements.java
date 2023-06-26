package com.serviceImplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.service.Course;
import com.service.NotFoundException;
import com.service.Student;
import com.service.StudentServices;

public class StudentServiceImplements implements StudentServices{

	ArrayList<Student> al= new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	Student stud= new Student();
	Course c= new Course();
	@Override
	public void add()
	{
		System.out.println("enter size of student");
		int size= sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("enter student id");
			int id= sc.nextInt();
			
			System.out.println("enter student name");
			String name= sc.next();
			
			System.out.println("enter student grade");
			double grade= sc.nextDouble();
			
			System.out.println("enter course id");
			int cid= sc.nextInt();
			stud.setC(c);
			
			System.out.println("enter course name");
			String cname= sc.next();
			stud.setC(c);
			
		Student stud=new Student(id,name,grade,new Course(cid,cname));
		al.add(stud);
		}
	}
	@Override
	public void searchByName()
	{
		System.out.println("enter a student name that you want to search");
		String search=sc.next();
		if(al.isEmpty())
		{
			throw new NotFoundException();
		}
		boolean isPresent=false;
		
		for(Student s1:al)
		{
			if(search.equalsIgnoreCase(s1.getName()))
			{
				isPresent=true;
			}
		}
		if(isPresent==true)
		{
			for(Student s1:al)
			{
				if(search.equalsIgnoreCase(s1.getName()))
				{
					System.out.println("student id= "+s1.getId()+" student name= "+s1.getName()+" student grade= "+s1.getGrade()+" student course id= "+s1.getC().getCid()+" student course name= "+s1.getC().getCname());
				}
			}
		}
		else
		{
			throw new NotFoundException();
		}
	}
	
	@Override
	public void display()
	{
		System.out.println("All students list");
		try
		{
			if(al.isEmpty())
			{
				throw new NullPointerException("Student not added in list");
			}
		}
		catch(NullPointerException n)
		{
			System.out.println(n.getMessage());
		}
		for(Student s1:al)
		{
			System.out.println("student id= "+s1.getId()+" student name= "+s1.getName()+" student grade= "+s1.getGrade()+" student course id= "+s1.getC().getCid()+" student course name= "+s1.getC().getCname());
		}
	}
	
	@Override
	public void displayByCourse()
	{
		System.out.println("enter a course name to print data");
		String data=sc.next();
		if(al.isEmpty())
		{
			throw new NotFoundException();
		}
		boolean isPresent=false;
		for(Student s1:al)
		{
			if(data.equals(s1.getC().getCname()))
			{
				isPresent=true;
			}
		}
		
		if(isPresent==true)
		{
			for(Student s1:al)
			{
				if(data.equals(s1.getC().getCname()))
				{
					System.out.println("student id= "+s1.getId()+" student name= "+s1.getName()+" student grade= "+s1.getGrade()+" student course id= "+s1.getC().getCid()+" student course name= "+s1.getC().getCname());
				}
			}
		}
		else
		{
			throw new NotFoundException();
		}
	}
	
	@Override
	public void delete() {
		
		System.out.println("enter student id you want to delete");
		int ids=sc.nextInt();
		if(al.isEmpty())
		{
			throw new NotFoundException();
		}
		else
		{
		for(int i=0;i<al.size();i++)
		{
			if(ids==al.get(i).getId())
			{
				al.remove(i);
				System.out.println("succesfully deleted");
			}
			else
			{
				throw new NotFoundException();
			}
		}
		}
		
	}
}
