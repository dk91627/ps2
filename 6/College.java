package com;

public class College 
{
	String collegeName;
	int collegeId;
	String place;
	public College(String collegeName, int collegeId, String place) 
	{
		super();
		this.collegeName = collegeName;
		this.collegeId = collegeId;
		this.place = place;
	}
	public String getCollegeName() 
	{
		return collegeName;
	}
	public void setCollegeName(String collegeName) 
	{
		this.collegeName = collegeName;
	}
	public int getCollegeId() 
	{
		return collegeId;
	}
	public void setCollegeId(int collegeId)
	{
		this.collegeId = collegeId;
	}
	public String getPlace() 
	{
		return place;
	}
	public void setPlace(String place)
	{
		this.place = place;
	}
	
	

}
