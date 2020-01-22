package com.Encapsulation_JavaBeanClass;


public class Test {

	public static void main(String args[])
	{
		Student s = new Student();
		s.setName("shashank");
		System.out.println(s.getName());
		
		s.setId(7);
		System.out.println(s.getId());
	}
	
}
