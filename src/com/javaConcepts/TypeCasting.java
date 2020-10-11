package com.javaConcepts;

import java.util.Scanner;
    
class Test20
{
	void test()
	{
		System.out.println("hello");
	}
}

public class TypeCasting extends Test20
{  	
	void disp()
	{
		System.out.println("bye");
	}

	public static void main(String[] args)    // main method overloading
	{
		
			
		Test20 t = new TypeCasting();  // UPCASTING
		t.test();  // superclass properties
		
		TypeCasting p	= (TypeCasting)t ; // DOWNCASTING
		p.disp();
		p.test();
	
		
		
	}


}





