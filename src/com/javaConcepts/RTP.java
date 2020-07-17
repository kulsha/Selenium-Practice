package com.javaConcepts;


class Test
{
	void disp()
	{
		System.out.println("I am from class Test");
	}
}

public class RTP extends Test {

	void disp()
	{
		System.out.println("I am from class RTP");
	}
	public static void main(String[] args) 
	{
		RTP rtp = new RTP();
		rtp.disp();
		
		Test t = new RTP();
		t.disp();
		
		Test t1 = new Test();
		t1.disp();

	}

}
