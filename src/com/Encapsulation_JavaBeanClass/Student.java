package com.Encapsulation_JavaBeanClass;

public class Student implements java.io.Serializable{

	private int id ; 
	private String name;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
}
