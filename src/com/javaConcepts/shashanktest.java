package com.javaConcepts;

interface inter  // by default abstract
{
	void test() ;  // method declaration
	void disp() ; 
	
	int a = 10 ;
		 
	
}


 abstract class qwerty implements inter{

	public void test()
	{
		System.out.println("test");
	}

	
}

public class shashanktest extends qwerty
{
	public void disp()
	{
		System.out.println("disp");
	}

	public static void main (String[] args)
	{
		
	
		
		shashanktest s = new shashanktest() ; 
		s.disp();
		s.test();
		
		System.out.println(inter.a) ; //
		System.out.println(s.a) ; 
		
	}
}
