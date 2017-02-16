package com;

public class Passenger
{
	private String passenName;
	private int age;
	private String phoneNumber;
	public Passenger(String passenName, int age, String phoneNumber) 
	{
		this.passenName = passenName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	public String getPassenName() 
	{
		return passenName;
	}
	public void setPassenName(String passenName)
	{
		this.passenName = passenName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

}
