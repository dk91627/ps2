package com;

public class Student 
{
	private int studId;
	private String buspassType;
	private boolean buspassProvided;
	public Student() 
	{
		
	}
	public Student(int studId, String buspassType, boolean buspassProvided) 
	{
		super();
		this.studId = studId;
		this.buspassType = buspassType;
		this.buspassProvided = buspassProvided;
	}
	public int getStudId() 
	{
		return studId;
	}
	public void setStudId(int studId) 
	{
		this.studId = studId;
	}
	public String getBuspassType() 
	{
		return buspassType;
	}
	public void setBuspassType(String buspassType) 
	{
		this.buspassType = buspassType;
	}
	public boolean isBuspassProvided() 
	{
		return buspassProvided;
	}
	public void setBuspassProvided(boolean buspassProvided)
	{
		this.buspassProvided = buspassProvided;
	}
	
	

}
