package com.javaConcepts;

// Polymorphism - An object behaving differently at different stages of its life cycle is called as Polymorphism 

// Types
	// Compile Time Polymorphism   - CTP
	// Run Time Polymorphism  - RTP

// RTP - Method declaration gets binded to if definition at runtime by the JVM based on the object created. LateBinding/DynamicBinding
// EXAMPLE - Method Overriding
// When a parent class reference variable points at child class object then the call to the overridden method is determined at runtime.
// Conditions
	// IS-A Relationship
	// Method Overriding
	// Upcasting


//CTP - Method declaration gets binded to if definition at CompileTime by the JVM based on the object created. EarlyBinding/Static Binding
// EXAMPLE - METHOD OVERLOADING

class Test1 extends Object
{
	void disp()
	{
		System.out.println("I am from class Test");
	}
	
	void test()
	{
		System.out.println("test");
	}
	
}

public class RTP extends Test1 {

	void disp()
	{
		System.out.println("I am from class RTP");
	}
	public static void main(String[] args) 
	{
		RTP rtp = new RTP();
		rtp.disp();   // method overriding
		rtp.test();   // inheritance concept
		
		Test1 t = new RTP();  
		t.disp();    // runtime polymorphism  - overridden implementation
		t.test();  // 
		
		Test1 t1 = new Test1();
		t1.disp();    

	}

}
