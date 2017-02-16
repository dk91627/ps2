package com;

public class Booking 
{
	private String passenPhoneNumber;
	private int busNumber;
	public Booking() 
	{
		
	}
	public Booking(String passenPhoneNumber, int busNumber) 
	{
		
		this.passenPhoneNumber = passenPhoneNumber;
		this.busNumber = busNumber;
	}
	public String getPassenPhoneNumber() 
	{
		return passenPhoneNumber;
	}
	public void setPassenPhoneNumber(String passenPhoneNumber)
	{
		this.passenPhoneNumber = passenPhoneNumber;
	}
	public int getBusNumber()
	{
		return busNumber;
	}
	public void setBusNumber(int busNumber) 
	{
		this.busNumber = busNumber;
	}
	
}
