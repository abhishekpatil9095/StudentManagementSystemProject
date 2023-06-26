package com.service;

public class NotFoundException extends RuntimeException{

	public NotFoundException()
	{
		System.out.println("Student not found in system");
	}
	public NotFoundException(String msg)
	{
		super(msg);
	}
}
